package com.springboot.serviceImpl;

import java.util.List;
import com.springboot.dao.BooksDao;
import com.springboot.entity.Books;
import com.springboot.mapper.BooksMapper;
import com.springboot.service.BooksService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BooksServiceImpl implements BooksService {

    @Autowired
    private BooksDao dao;

    @Autowired
    private BooksMapper booksMapper;

    @Override
    public List<Books> findAll() {

        List<Books> list = this.dao.findAll();

        return list;

    }

    @Override
    public List<Books> queryBooksByFuzzy(String fuzzy){

        List<Books> list = this.booksMapper.queryBooksByFuzzy(fuzzy);

        return list;
    }

    @Override
    public Books queryBooksByISBN(String ISBN){

        Books article = this.booksMapper.queryBooksByISBN(ISBN);

        return article;
    }

}
