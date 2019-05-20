package com.springboot.service;

import com.springboot.entity.Reader;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ReaderService {

    List<Reader> findAll();

    int insertReader(Reader reader);

    Reader queryReaderById(int reader_id);

    Reader queryReaderByUser_name(String user_name);

    int updateLimits(@Param("limits") int limits, @Param("reader_id") int reader_id);

}
