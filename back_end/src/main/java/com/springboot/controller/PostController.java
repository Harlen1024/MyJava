package com.springboot.controller;

import com.springboot.MD5.MD5;
import com.springboot.entity.Reader;
import com.springboot.entity.Record;
import com.springboot.service.ReaderService;
import com.springboot.service.RecordService;
import com.springboot.tool.datetool.DateResult;
import com.springboot.tool.jsontool.JsonResult;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

/** 所有的post请求的接口
 *  1./api//append/record 上传借书记录到mysql的record表中
 *  2./api/append/reader 上传新的用户到mysql的reader表中
 *  3./append/reader/limits 更新reader表中的limits借书限制 键值为二 value = id && flag
 *  4./append/record/delete 删除record表中借书纪录 键值为一 value = ISBN
 *  5./append/record/login 登录用api 键值为二 value = user_name && password
 *  6.
 */

@RestController
@CrossOrigin
@RequestMapping("/api")
public class PostController {

    //日期工具类
    DateResult dateResult = new DateResult();

    @Autowired
    private ReaderService readerService;

    @Autowired
    private RecordService recordService;

    //上传书籍流动记录
    @RequestMapping(value = "/append/record", method = RequestMethod.POST)
    public Map<String, Object> insertRecord(@RequestBody Record record) {

        //上传流动记录获取当前系统借书时间
        record.setBorrowing_date(dateResult.getCurrentTime());

        Map<String, Object> param = new HashMap<String, Object>();
        param.put("record", record);
        recordService.insertRecord(record);
        return param;

    }

    //注册新的用户
    @RequestMapping(value = "/append/reader", method = RequestMethod.POST)
    public Map<String, Object> insertReader(@RequestBody Reader reader) {

        //MD5加密
        MD5 getMD5 = new MD5();

        //MD5加密密码
        reader.setPassword(getMD5.getMD5Code(reader.getPassword()));

        Map<String, Object> param = new HashMap<String, Object>();
        param.put("reader", reader);
        readerService.insertReader(reader);
        return param;

    }

    //更新reader表中的limits借书限制flag=1 -> limits++ / flag=0 -> limits--
    @RequestMapping(value = "/append/reader/limits", method = RequestMethod.POST)
    public JsonResult updateLimits(@RequestParam(value = "id") String id,
                                   @RequestParam(value = "flag") String flag) {

        int ID = Integer.parseInt(id);
        int FLAG = Integer.parseInt(flag);

        Reader reader = this.readerService.queryReaderById(ID);

        int temp = reader.getLimits();

        if(FLAG == 1) {
            readerService.updateLimits(temp += 1, ID);
        }
        else if(FLAG == 0){
            if (temp == 0){
                return JsonResult.ok(temp);
            }
            else{
                readerService.updateLimits(temp -= 1, ID);
            }
        }

        return JsonResult.ok(temp+1);

    }

    //根据ISBN删除对应借书记录
    @RequestMapping(value = "/append/record/delete", method = RequestMethod.POST)
    public JsonResult deleteRecord(@RequestParam(value = "ISBN") String ISBN) {

        int temp = recordService.deleteRecord(ISBN);

        return JsonResult.ok("success");

    }

    //根据用户名登录
    @RequestMapping(value = "/append/record/login", method = RequestMethod.POST)
    public JsonResult readerLogin(@RequestParam(value = "user_name") String user_name,
                                  @RequestParam(value = "password") String password) {

        Reader reader = this.readerService.queryReaderByUser_name(user_name);

        //MD5加密
        MD5 getMD5 = new MD5();

        if(reader != null) {
            if (reader.getPassword().equals(getMD5.getMD5Code(password))) {

                return JsonResult.ok("success");

            }
        }

        return JsonResult.ok("defeat");

    }

}