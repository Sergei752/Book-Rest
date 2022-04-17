package com.pystin.rest;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookRepoDBImpl implements BookRepo{

    private static final String SELECT_ALL = "SELECT * FROM books";
    private static final String SELECT = "SELECT * FROM books WHERE book_id = ?";
    private static final String INSERT = "INSERT INTO books (author, name_book, text) VALUES (?, ?, ?)";
    private static final String UPDATE = "UPDATE books SET author = ?, name_book = ?, text = ? WHERE book_id = ?";
    private static final String DELETE = "DELETE FROM books WHERE book_id = ?";

    @Override
    public List<Book> readAll() throws SQLException{
        List<Book> books = new ArrayList<>();

            try(Connection conn = DBConnection.getDBConnection();
                PreparedStatement statement = conn.prepareStatement(SELECT_ALL)) {
                ResultSet rs = statement.executeQuery();

                while (rs.next()) {
                    books.add(new Book(
                        rs.getLong("book_id"),
                        rs.getString("author"),
                        rs.getString("name_book"),
                        rs.getString("text")));
                }
            }
        return books;
    }

    @Override
    public Book read(long id) throws SQLException {
        try (Connection conn = DBConnection.getDBConnection();
            PreparedStatement statement = conn.prepareStatement(SELECT)) {

            statement.setLong(1, id);
            ResultSet rs = statement.executeQuery();

            Book book = new Book();
            while (rs.next()) {
                book.setId(rs.getLong("book_id"));
                book.setAuthor(rs.getString("author"));
                book.setNameBook(rs.getString("name_book"));
                book.setText(rs.getString("text"));
            }
            return book;
            }
    }

    @Override
    public long create(Book book) throws SQLException {
        try (Connection conn = DBConnection.getDBConnection();
             PreparedStatement statement = conn.prepareStatement(INSERT))
        {
            //statement.setLong(1, book.getId());
            statement.setString(1, book.getAuthor());
            statement.setString(2, book.getNameBook());
            statement.setString(3, book.getText());
            return statement.executeUpdate();
        }
    }

    @Override
    public long update(long id, Book book) throws SQLException {
        try (Connection conn = DBConnection.getDBConnection();
             PreparedStatement statement = conn.prepareStatement(UPDATE))
        {
            statement.setString(1, book.getAuthor());
            statement.setString(2, book.getNameBook());
            statement.setString(3, book.getText());
            statement.setLong(4, id);
            return statement.executeUpdate();
        }
    }

    @Override
    public long delete(long id) throws SQLException {
        try (Connection conn = DBConnection.getDBConnection();
             PreparedStatement statement = conn.prepareStatement(DELETE)) {

            statement.setLong(1, id);

            return statement.executeUpdate();
        }
    }
}
