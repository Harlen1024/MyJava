package com.springboot.dao;

import com.springboot.entity.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReaderDao extends JpaRepository<Reader, Long> {
}