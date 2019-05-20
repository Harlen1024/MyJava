package com.springboot.service;

import com.springboot.entity.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BooksService {

    List<Books> findAll();

    List<Books> queryBooksByFuzzy(String fuzzy);

    Books queryBooksByISBN(String ISBN);

}
