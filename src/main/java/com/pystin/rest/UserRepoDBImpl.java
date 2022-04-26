package com.pystin.rest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRepoDBImpl implements UserRepo{

    @Override
    public User readUser(long id) throws SQLException {
        try (Connection conn = DBConnection.getDBConnection();
             PreparedStatement statement = conn.prepareStatement("SELECT * FROM users WHERE user_id=?")) {

            statement.setLong(1, id);
            ResultSet rs = statement.executeQuery();

            User user = new User();
            while (rs.next()) {
                user.setUser_id(rs.getLong("user_id"));
                user.setUser_name(rs.getString("user_name"));
                user.setUser_password(rs.getString("user_password"));
            }
            return user;
        }
    }
}
