package com.company.database;

import com.company.website.Website;
import java.util.ArrayList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * The type Database manager.
 */
public class DatabaseManager {
    // database URL
    private String url = "jdbc:mysql://localhost:0000";
    
    // JDBC variables for opening and managing connection
    private static Connection connection;
    private Statement statement;
    private ResultSet resultSet;

    private static DatabaseManager instance;

    private DatabaseManager() {
        try {
            connection = DriverManager.getConnection(url);
            statement = connection.createStatement();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Gets instance.Singleton implementation.
     *
     * @return the instance
     */
    public static DatabaseManager getInstance() {
        if (instance == null) {
            instance = new DatabaseManager();
        }
        return instance;
    }

    /**
     * Get website website.
     *
     * @param website the website
     * @return the website
     */
    public ArrayList<Website> getWebsites(String query){
        ArrayList<String> description = new ArrayList<String>();
        ArrayList<String> keywords = new ArrayList<String>();
        ArrayList<Website> results = new ArrayList<Website>();
        Website resultWebsite = null;
        try{
            resultSet = statement.executeQuery(query);
            String url = resultSet.getString(0);
            description.add(resultSet.getString(1));
            keywords.add(resultSet.getString(2));

            resultWebsite = new Website(url, description, keywords);
            results.add(resultWebsite);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return results;
    }

    /**
     * Post website.
     *
     * @param website the website
     */
    public void postWebsite(Website website){
        String postQuery = website.toString(); 
        try{
            statement.executeQuery(postQuery);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Update rating.
     *
     * @param website the website
     * @param rating  the rating
     */

    public void updateRating(Website website, int rating){
        String updateRatingQuery = website.toString() + String.valueOf(rating); 
        try{
            statement.executeQuery(updateRatingQuery);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Put website.
     *
     * @param website the website
     */
    public void putWebsite(Website website){
        String putQuery = website.toString(); 
        try{
            statement.executeQuery(putQuery);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Delete website website.
     *
     * @param website the website
     * @return the website
     */
    public Website deleteWebsite(Website website){
        String deleteQuery = website.toString(); 
        try{
            statement.executeQuery(deleteQuery);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return website;
    }
}

