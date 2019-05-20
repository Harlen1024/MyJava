package com.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Record {

    @Id
    private int record_id;

    private String isbn;

    private int reader_id;

    private String borrowing_date;

    private String return_date;

    public int getRecord_id() {
        return record_id;
    }

    public void setRecord_id(int record_id) {
        this.record_id = record_id;
    }

    public String getISBN() {
        return isbn;
    }

    public void setISBN(String ISBN) {
        this.isbn = ISBN;
    }

    public int getReader_id() {
        return reader_id;
    }

    public void setReader_id(int reader_id) {
        this.reader_id = reader_id;
    }

    public String getBorrowing_date() {
        return borrowing_date;
    }

    public void setBorrowing_date(String borrowing_date) {
        this.borrowing_date = borrowing_date;
    }

    public String getReturn_date() {
        return return_date;
    }

    public void setReturn_date(String return_date) {
        this.return_date = return_date;
    }
}
