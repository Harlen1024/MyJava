package com.springboot.controller;

import com.springboot.entity.Books;
import com.springboot.entity.Reader;
import com.springboot.entity.Record;
import com.springboot.service.ReaderService;
import com.springboot.service.RecordService;
import com.springboot.tool.jsontool.JsonResult;
import com.springboot.service.BooksService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

/** 所有的get请求的接口
 *  1./api/query/books 查询mysql中books表全部数据
 *  2./api/query/reader 查询mysql中reader表全部数据
 *  3./api/query/record 查询mysql中record表全部数据
 *  4./api/query/books/ISBN/{ISBN} 根据ISBN查询mysql中books表的数据
 *  5./api/query/readers/id/{id} 根据id查询mysql中reader表的数据
 *  6./api/query/record/ISBN/{ISBN} 根据ISBN查询mysql中record表的数据
 *  7./api/query/record/reader_id/{reader_id} 根据reader_id查询mysql中record表的数据
 *  8./api/query/books/fuzzy/{fuzzy} 模糊查询mysql中books表全部数据
 *  9.query/readers/user_name/{user_name} 根据user_name查询mysql中reader表的数据
*/

@RestController
@CrossOrigin
@RequestMapping("/api")
public class GetController {

    @Autowired
    private BooksService booksService;

    @Autowired
    private ReaderService readerService;

    @Autowired
    private RecordService recordService;

    //获取mysql中books表全部数据
    @RequestMapping("/query/books")
    @ResponseBody
    public JsonResult queryBooksAll() {

        List<Books> list = this.booksService.findAll();

        return JsonResult.ok(list);

    }

    //获取mysql中reader表全部数据
    @RequestMapping("/query/reader")
    @ResponseBody
    public JsonResult queryReaderAll() {

        List<Reader> list = this.readerService.findAll();


        return JsonResult.ok(list);

    }

    //获取mysql中books表全部数据
    @RequestMapping("/query/record")
    @ResponseBody
    public JsonResult queryRecordAll() {

        List<Record> list = this.recordService.findAll();

        return JsonResult.ok(list);

    }

    //mysql单类型查询()
    @RequestMapping("query/books/fuzzy/{fuzzy}")
    public JsonResult queryBooksByFuzzy(@PathVariable String fuzzy) {

        List<Books> list = this.booksService.queryBooksByFuzzy(fuzzy);

        return JsonResult.ok(list);

    }

    //mysql单类型查询()
    @RequestMapping("query/books/ISBN/{ISBN}")
    public JsonResult queryBooksByISBN(@PathVariable String ISBN) {

        Books books = this.booksService.queryBooksByISBN(ISBN);

        return JsonResult.ok(books);

    }

    //mysql单类型查询()
    @RequestMapping("query/readers/reader_id/{reader_id}")
    public JsonResult queryReaderById(@PathVariable int reader_id) {

        Reader reader = this.readerService.queryReaderById(reader_id);

        return JsonResult.ok(reader);

    }

    //mysql单类型查询()
    @RequestMapping("query/record/ISBN/{ISBN}")
    public JsonResult queryRecordByISBN(@PathVariable String ISBN) {

        Record record = this.recordService.queryRecordByISBN(ISBN);

        //如果查询到相应记录则返回归还日期
        try {
            if (record == null) {
                return JsonResult.ok("No Record!");
            }
        }
        catch(NullPointerException e) {
            System.out.println("发生异常的原因为 :"+e.getMessage());
        }

        return JsonResult.ok(record.getReturn_date());
    }

    //mysql单类型查询()
    @RequestMapping("query/record/reader_id/{reader_id}")
    public JsonResult queryRecordByReader_id(@PathVariable int reader_id) {

        List<Record> list = this.recordService.queryRecordByReader_id(reader_id);

        return JsonResult.ok(list);

    }

    //mysql单类型查询()
    @RequestMapping("query/readers/user_name/{user_name}")
    public JsonResult queryReaderByUser_name(@PathVariable String user_name) {

        Reader reader = this.readerService.queryReaderByUser_name(user_name);

        return JsonResult.ok(reader);

    }

}
