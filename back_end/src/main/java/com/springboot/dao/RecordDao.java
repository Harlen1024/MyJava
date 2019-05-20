package com.springboot.dao;

import com.springboot.entity.Record;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordDao extends JpaRepository<Record, Long> {
}