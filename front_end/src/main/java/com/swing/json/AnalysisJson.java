package com.swing.json;

import com.google.gson.Gson;
import com.swing.entity.*;
import com.swing.httprequest.HttpRequest;
import jdk.nashorn.internal.runtime.JSONFunctions;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import static com.swing.tool.urltool.UrlCode.urlEncode;

//解析json数据的类
public class AnalysisJson {

    //解析登录接口的json数据 success为成功
    //eg：{"status":200,"msg":"OK","data":"success","ok":null}
    public static boolean loginJson(String user_name, String password) {

        String param = "user_name=" + user_name + "&password=" + password;

        //http://localhost:8080/api/append/record/login
        String json_temp = HttpRequest.sendPost("http://47.95.3.253:8080/back_end/api/append/record/login",
                param);

        Gson gson=new Gson();

        //解析对象：第一个参数：待解析的字符串 第二个参数结果数据类型的Class对象
        JsonResult readerLogin=gson.fromJson(json_temp, JsonResult.class);
        if(readerLogin.getData().equals("success")){
            //登录成功
            return true;
        }
        return false;

    }

    //向注册接口发送reader信息封装的json
    //解析注册接口的json数据 success为成功
    //eg：{"status":200,"msg":"OK","data":"success","ok":null}
    public static boolean registerJson(PostReader postReader){

        Gson gson=new Gson();
        //将对象转换为诶JSON格式字符串
        String json=gson.toJson(postReader);
        //System.out.println(json);
        //向接口post json(postReader)
        String json_temp = HttpRequest.sendJsonPost("http://47.95.3.253:8080/back_end/api/append/reader", json);
        if(json_temp != null){
            return true;
        }

        return false;

    }

    //获取查询全部图书信息的接口的json数据
    public static List<Books> getBooksJson(){

        Gson gson=new Gson();

        //http://localhost:8080/api/query/books
        String json_temp = HttpRequest.sendGet("http://47.95.3.253:8080/back_end/api/query/books");

        //解析对象：第一个参数：待解析的字符串 第二个参数结果数据类型的Class对象
        JsonResultBooksList readerLogin=gson.fromJson(json_temp, JsonResultBooksList.class);

        return readerLogin.getData();
    }

    //获取条件查部分部图书信息的接口的json数据
    public static List<Books> getPartBooksJson(String fuzzy) throws UnsupportedEncodingException {

        Gson gson=new Gson();

        //处理汉字编码发送请求问题
        String url = "http://47.95.3.253:8080/back_end/api/query/books/fuzzy/" + urlEncode(fuzzy);

        //http://localhost:8080/api/query/books/fuzzy/{fuzzy}
        String json_temp = HttpRequest.sendGet(url);

        //解析对象：第一个参数：待解析的字符串 第二个参数结果数据类型的Class对象
        JsonResultBooksList readerLogin=gson.fromJson(json_temp, JsonResultBooksList.class);

        return readerLogin.getData();
    }

    //向记录查询接口发送获取get请求
    //解析注册接口的json数据 success为成功
    //eg：{"status":200,"msg":"OK","data":"一个日期","ok":null}
    public static String recordDateJson(String ISBN){

        Gson gson=new Gson();
        //get json
        String json_temp = HttpRequest.sendGet("http://47.95.3.253:8080/back_end/api/query/record/ISBN/" + ISBN);


        //解析对象：第一个参数：待解析的字符串 第二个参数结果数据类型的Class对象
        JsonResult record=gson.fromJson(json_temp, JsonResult.class);
        if(!record.getData().equals("No Record!")){
            //查询成功
            return record.getData();
        }
        return null;

    }

    //向查询读者借书限制接口发送获取post请求
    public static boolean readerLimitsJson(String user_name){

        Gson gson1=new Gson();

        //获取id
        String json_reader = HttpRequest.sendGet("http://47.95.3.253:8080/back_end/api/query/readers/user_name/" + user_name);

        //解析对象：第一个参数：待解析的字符串 第二个参数结果数据类型的Class对象
        JsonResultReader jsonResultReader=gson1.fromJson(json_reader, JsonResultReader.class);

        //参数 flag=1 -> limits++ / flag=0 -> limits--
        String param = "id=" + String.valueOf(jsonResultReader.getData().getReader_id()) + "&flag=" + "0";

        Gson gson2=new Gson();
        //get json
        String json_temp = HttpRequest.sendPost("http://47.95.3.253:8080/back_end/api/append/reader/limits" , param);


        //解析对象：第一个参数：待解析的字符串 第二个参数结果数据类型的Class对象
        JsonResult reader_limits=gson2.fromJson(json_temp, JsonResult.class);
        if(reader_limits.getData().equals("0")){
            //查询成功(不可借)
            return false;
        }
        return true;

    }

    //获取读者id(get)
    public static int readerIdJson(String user_name) {

        Gson gson1=new Gson();

        //获取id
        String json_reader = HttpRequest.sendGet("http://47.95.3.253:8080/back_end/api/query/readers/user_name/" + user_name);

        //解析对象：第一个参数：待解析的字符串 第二个参数结果数据类型的Class对象
        JsonResultReader jsonResultReader=gson1.fromJson(json_reader, JsonResultReader.class);

        return jsonResultReader.getData().getReader_id();
    }

    //向借书记录接口发送record信息封装的json
    //解析注册接口的json数据 success为成功
    //eg：{"status":200,"msg":"OK","data":"success","ok":null}
    public static boolean recordJson(PostRecord postRecord){

        Gson gson=new Gson();
        //将对象转换为诶JSON格式字符串
        String json=gson.toJson(postRecord);
        //System.out.println(json);
        //向接口post json(postRecord)
        String json_temp = HttpRequest.sendJsonPost("http://47.95.3.253:8080/back_end/api/append/record", json);
        if(json_temp != null){
            return true;
        }

        return false;

    }

    //向对应读者查询图书流动情况接口发送获取post请求
    public static List<Record> queryReaderRecordJson(String user_name){

        Gson gson1=new Gson();

        //获取id
        String json_reader = HttpRequest.sendGet("http://47.95.3.253:8080/back_end/api/query/readers/user_name/" + user_name);

        //解析对象：第一个参数：待解析的字符串 第二个参数结果数据类型的Class对象
        JsonResultReader jsonResultReader=gson1.fromJson(json_reader, JsonResultReader.class);

        Gson gson2=new Gson();

        String json_record = HttpRequest.sendGet("http://47.95.3.253:8080/back_end/api/query/record/reader_id/" + String.valueOf(jsonResultReader.getData().getReader_id()));

        //解析对象：第一个参数：待解析的字符串 第二个参数结果数据类型的Class对象
        JsonResultRecordList jsonResultRecordList=gson2.fromJson(json_record, JsonResultRecordList.class);

       return jsonResultRecordList.getData();

    }

    //删除书籍流动信息的接口 post
    //eg：{"status":200,"msg":"OK","data":"success","ok":null}
    public static boolean deleteJson(String ISBN) {

        String param = "ISBN=" + ISBN;

        //http://localhost:8080/api/append/record/login
        String json_temp = HttpRequest.sendPost("http://47.95.3.253:8080/back_end/api/append/record/delete", param);

        Gson gson=new Gson();

        //解析对象：第一个参数：待解析的字符串 第二个参数结果数据类型的Class对象
        JsonResult jsonResult=gson.fromJson(json_temp, JsonResult.class);
        if(jsonResult.getData().equals("success")){
            //登录成功
            return true;
        }
        return false;

    }

    //还书时limits++ 的接口
    public static void readerLimitsUpJson(String user_name){

        Gson gson1=new Gson();

        //获取id
        String json_reader = HttpRequest.sendGet("http://47.95.3.253:8080/back_end/api/query/readers/user_name/" + user_name);

        //解析对象：第一个参数：待解析的字符串 第二个参数结果数据类型的Class对象
        JsonResultReader jsonResultReader=gson1.fromJson(json_reader, JsonResultReader.class);

        //参数 flag=1 -> limits++ / flag=0 -> limits--
        String param = "id=" + String.valueOf(jsonResultReader.getData().getReader_id()) + "&flag=" + "1";

        Gson gson2=new Gson();
        //get json
        String json_temp = HttpRequest.sendPost("http://47.95.3.253:8080/back_end/api/append/reader/limits" , param);


    }

        public static void main(String[] args) {

            getBooksJson();
            //System.out.println(getBooksJson().get(1).getISBN());

    }


}
