package com.swing.entity;

public class PostRecord {

    private String isbn;

    private int reader_id;

    private String borrowing_date;

    private String return_date;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
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
