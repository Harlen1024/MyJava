package com.springboot.mapper;

import java.util.List;

import com.springboot.entity.Record;
import org.apache.ibatis.annotations.*;

@Mapper
public interface RecordMapper {

    //添加新的书籍流动记录
    @Insert("INSERT INTO record (isbn, reader_id, borrowing_date, return_date) "
            + "VALUES (#{isbn}, #{reader_id}, #{borrowing_date}, #{return_date})")
    int insertRecord(Record record);

    //按ISBN查找
    @Select("SELECT * FROM record WHERE ISBN like '%${value}%'")
    Record queryRecordByISBN(String ISBN);

    //按reader_id查找
    @Select("SELECT * FROM record WHERE reader_id like '%${value}%'")
    List<Record> queryRecordByReader_id(int reader_id);

    //按ISBN删除
    @Delete("DELETE from record where isbn =#{ISBN}")
    int deleteRecord(@Param("ISBN") String ISBN);

}