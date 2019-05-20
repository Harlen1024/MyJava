package com.springboot.serviceImpl;

import java.util.List;
import com.springboot.dao.RecordDao;
import com.springboot.entity.Record;
import com.springboot.mapper.RecordMapper;
import com.springboot.service.RecordService;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RecordServiceImpl implements RecordService {

    @Autowired
    private RecordDao dao;

    @Autowired
    private RecordMapper recordMapper;

    @Override
    public List<Record> findAll() {

        List<Record> list = this.dao.findAll();

        return list;

    }

    @Override
    public int insertRecord(Record record){

        int temp = this.recordMapper.insertRecord(record);

        return temp;
    }

    @Override
    public Record queryRecordByISBN(String ISBN){

        Record record = this.recordMapper.queryRecordByISBN(ISBN);

        return record;
    }

    @Override
    public int deleteRecord(@Param("ISBN") String ISBN){

        int temp = this.recordMapper.deleteRecord(ISBN);

        return temp;
    }

    @Override
    public List<Record> queryRecordByReader_id(int reader_id){

        List<Record> list = this.recordMapper.queryRecordByReader_id(reader_id);

        return list;

    }

}
