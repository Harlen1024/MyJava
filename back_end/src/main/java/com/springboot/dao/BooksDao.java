package com.springboot.dao;

import com.springboot.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksDao extends JpaRepository<Books, Long> {
}