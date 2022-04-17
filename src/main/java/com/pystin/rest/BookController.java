package com.pystin.rest;

import com.pystin.rest.BookRepoDBImpl;
import com.pystin.rest.BookRepo;
import com.pystin.rest.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class BookController {

    public BookRepo repo = new BookRepoDBImpl();

        @GetMapping("/books")
        public List<Book> readAll() throws SQLException {
            return repo.readAll();
        }

        @GetMapping("/books/{id}")
        public Book read(@PathVariable long id) throws SQLException {
            return repo.read(id);
        }

        @PostMapping("/books" )
        public Book create(@RequestBody Book newBook) throws SQLException {
            repo.create(newBook);
            return newBook;
        }

        @PutMapping("/books/{id}")
        public Book update(@PathVariable long id, @RequestBody Book newBook) throws SQLException{
            repo.update(id, newBook);
            return newBook;
        }

//        @DeleteMapping("/books/{id}")
//        public long delete(@PathVariable long id) throws SQLException {
//            return repo.delete(id);
//        }

        @DeleteMapping("/books/{id}")
        public List<Book> delete(@PathVariable long id) throws SQLException {
            repo.delete(id);
            return repo.readAll();
        }

//    private BookRepoListImpl repo = new BookRepoListImpl();
//
//    Book book3 = new Book(3, "Three Name", "Three Anonse", "Three Text");
//
//    @GetMapping("/1")
//    public String getString() {
//        return "Hi, it's String!";
//    }
//
//    @GetMapping("/map")
//    public Map<String, Integer> bookMap() {
//        HashMap<String, Integer> map = new HashMap<>();
//        map.put("book", 1);
//        map.put("book2", 2);
//        map.put("book3", 3);
//        return map;
//    }
//
//    @GetMapping("/book")
//    public Book get1() {
//        Book book = new Book(1, "One Name", "One Anonse", "One Text");
//        return book;
//    }
//
//    @GetMapping("/book2")
//    public Book get2() {
//        Book book = new Book();
//        book.setId(2);
//        book.setName("Two Name");
//        book.setAnonse("Two Anonse");
//        book.setText("Two Text");
//        return book;
//    }
//
//    @GetMapping("/book3")
//    public Book getBook3() {
//        return book3;
//    }
//
//    @GetMapping("/books")
//    public List<Book> readAll() {
////        List<Book> books;
////        {
////            books = new ArrayList<>();
////            books.add(new Book(4, "Four Name", "Four Anonse", "Four Text"));
////            books.add(new Book(5, "Five Name", "Five Anonse", "Five Text"));
////            books.add(new Book(6, "Six Name", "Six Anonse", "Six Text"));
////        }
////        return books;
//        return repo.readAll();
//    }
//
//    @GetMapping("/book/getId")
//    public Book read() {
//        return repo.read();
//    }
//
//    @GetMapping("/book/addBook")
//    public List<Book> create() {
//        return repo.create();
//    }
//
//    @GetMapping("book/dellBook")
//    public  List<Book> delete() {
//        return repo.delete();
//    }
}
