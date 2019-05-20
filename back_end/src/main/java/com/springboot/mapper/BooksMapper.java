package com.springboot.mapper;

import java.util.List;

import com.springboot.entity.Books;
import org.apache.ibatis.annotations.*;

@Mapper
public interface BooksMapper {

    //条件模糊查找
    @Select("SELECT * FROM books WHERE isbn = #{fuzzy} " +
            "OR title = #{fuzzy} " +
            "OR authors = #{fuzzy} " +
            "OR publisher = #{fuzzy} " +
            "OR edition_number = #{fuzzy} " +
            "OR publication_date = #{fuzzy} " +
            "OR type = #{fuzzy} ")
    List<Books> queryBooksByFuzzy(String fuzzy);

    //按ISBN查询
    @Select("SELECT * FROM books WHERE ISBN like '%${value}%'")
    Books queryBooksByISBN(String ISBN);


}