package com.pystin.rest;

import java.sql.SQLException;
import java.util.List;

public interface BookRepo {

    List<Book> readAll() throws SQLException;
    Book read(long id) throws SQLException;
    long create(Book book) throws SQLException;
    long update(long id, Book book) throws SQLException;
    long delete(long id) throws SQLException;

}
