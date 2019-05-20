package com.springboot.serviceImpl;

import java.util.List;
import com.springboot.dao.ReaderDao;
import com.springboot.entity.Books;
import com.springboot.entity.Reader;
import com.springboot.mapper.ReaderMapper;
import com.springboot.mapper.RecordMapper;
import com.springboot.service.ReaderService;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ReaderServiceImpl implements ReaderService {

    @Autowired
    private ReaderDao dao;

    @Autowired
    private ReaderMapper readerMapper;

    @Override
    public List<Reader> findAll() {

        List<Reader> list = this.dao.findAll();

        return list;

    }

    @Override
    public int insertReader(Reader reader){

        int temp = this.readerMapper.insertReader(reader);

        return temp;

    }

    @Override
    public Reader queryReaderById(int reader_id){

        Reader reader = this.readerMapper.queryReaderById(reader_id);

        return reader;
    }

    @Override
    public Reader queryReaderByUser_name(String user_name){

        Reader reader = this.readerMapper.queryReaderByUser_name(user_name);

        return reader;
    }

    @Override
    public int updateLimits(@Param("limits") int limits, @Param("reader_id") int reader_id){

        int temp = this.readerMapper.updateLimits(limits,reader_id);

        return temp;
    }

}
