package com.springboot.service;

import com.springboot.entity.Record;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RecordService {

    List<Record> findAll();

    int insertRecord(Record record);

    Record queryRecordByISBN(String ISBN);

    int deleteRecord(@Param("ISBN") String ISBN);

    List<Record> queryRecordByReader_id(int reader_id);

}
