package com.pystin.rest;

import java.sql.SQLException;

public interface UserRepo {
    User readUser(long id) throws SQLException;
}
