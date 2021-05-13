package com.company.database;

import com.company.users.WebsiteOwner;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * The type User authentication manager.
 */
public class UserAuthenticationManager {
    // database URL
    private String url = "jdbc:mysql://localhost:0000";

    // JDBC variables for opening and managing connection
    private static Connection connection;
    private Statement statement;
    private ResultSet resultSet;

    private static UserAuthenticationManager instance;

    /**
     * Gets instance of authentication manager.
     *
     * @return the instance
     */
    public static UserAuthenticationManager getInstance() {
        if (instance == null) {
            instance = new UserAuthenticationManager();
        }
        return instance;
    }

    /**
     * Check password.
     *
     * @param password the password
     * @return the boolean
     */
    public boolean checkPassword(String password) {
        return true;
    }

    /**
     * Check login.
     *
     * @param login the login
     * @return the boolean
     */
    public boolean checkLogin(String login) {
        return true;
    }

    /**
     * Register user.
     *
     * @param owner the owner
     * @return the boolean
     */
    public boolean registerUser(WebsiteOwner owner) {
        return true;
    }

}
