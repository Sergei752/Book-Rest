//package com.pystin.rest;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class BookRepoListImpl {
//
//    List<Book> books;
//
//    {
//        books = new ArrayList<>();
//        books.add(new Book(4, "Four Name", "Four Anonse", "Four Text"));
//        books.add(new Book(5, "Five Name", "Five Anonse", "Five Text"));
//        books.add(new Book(6, "Six Name", "Six Anonse", "Six Text"));
//    }
//
//    public List<Book> readAll() {
//        return books;
//    }
//
//    public Book read() {
//        Book book4 = books.get(0);
//        return book4;
//    }
//
//    public List <Book> create() {
//        books.add(new Book(7, "Seven Name", "Seven Anonse", "Seven Text"));
//        return books;
//    }
//
//    public List <Book> delete() {
//        books.remove(2);
//        return books;
//    }
//}
