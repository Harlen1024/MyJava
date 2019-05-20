package com.springboot.mapper;

import java.util.List;

import com.springboot.entity.Reader;
import org.apache.ibatis.annotations.*;

@Mapper
public interface ReaderMapper {

    //添加新读者
    @Insert("INSERT INTO reader (first_name, last_name, address, phone_number, limits, user_name, password) "
            + "VALUES (#{first_name}, #{last_name}, #{address}, #{phone_number}, #{limits}, #{user_name}, #{password})")
    int insertReader(Reader reader);

    //按id查找
    @Select("SELECT * FROM reader WHERE reader_id like '%${value}%'")
    Reader queryReaderById(int reader_id);

    //按用户名查找
    @Select("SELECT * FROM reader WHERE user_name like '%${value}%'")
    Reader queryReaderByUser_name(String user_name);

    //更新最大借阅数
    @Update("UPDATE reader SET `limits`=#{limits} WHERE reader_id =#{reader_id}")
    int updateLimits(@Param("limits") int limits, @Param("reader_id") int reader_id);


}