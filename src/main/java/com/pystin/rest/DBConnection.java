package com.pystin.rest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Optional;

//public class DBConnection {
//
//    private static Optional<Connection> connection = Optional.empty();
//
//    public static Optional<Connection> getConnection() {
//
//        if (connection.isEmpty()) {
//            String url = "jdbc:postgresql://localhost:5432/books";
//            String user = "postgres";
//            String password = "2222";
//
//            try {
//                connection = Optional.ofNullable(
//                    DriverManager.getConnection(url, user, password));
//                    System.out.println("Connection successfully!");
//            } catch (SQLException e) {
//                System.out.println("Connection failed!");
//            }
//        }
//
//        return connection;
//    }
//}

public class DBConnection {

    //private static DBConnection connection = new DBConnection();
    //public static DBConnection getConnection() {

    private static final String url = "jdbc:postgresql://localhost:5432/books";
    private static final String user = "postgres";
    private static final String password = "2222";

//            try {
//                DBConnection connection = DriverManager.getConnection(url, user, password)) {
//                System.out.println("Connection successfully!");
//            } catch (SQLException e) {
//                System.out.println("Connection failed!");
//            } catch (Exception e) {
//                    e.printStackTrace();
//                }
        //return connection;
        static Connection getDBConnection() throws SQLException {
            return DriverManager.getConnection(url, user, password);
        }
    }

