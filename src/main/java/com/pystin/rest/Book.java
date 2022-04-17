package com.pystin.rest;

public class Book {
    private long book_id;
    private String author;
    private String nameBook;
    private String text;

    public Book() {
    }

    public Book(long book_id, String author, String name_book, String text) {
        this.book_id = book_id;
        this.author = author;
        this.nameBook = name_book;
        this.text = text;
    }

    public long getId() {
        return book_id;
    }

    public void setId(long book_id) {
        this.book_id = book_id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String name_book) {
        this.nameBook = name_book;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
