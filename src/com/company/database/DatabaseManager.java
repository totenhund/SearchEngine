package com.company.database;

public class DatabaseManager {

    private static DatabaseManager instance;
    public String value;

    private DatabaseManager(String value) {
        
        this.value = value;
    }

    public static DatabaseManager getInstance(String value) {
        if (instance == null) {
            instance = new DatabaseManager(value);
        }
        return instance;
    }

    public Website getWebsite(){

    }
    
    public void postWebsite(){

    }
    
    public void updateRating(){

    }
    
    public void putWebsite(){

    }
    
    public Website deleteWebsite(){

    }
}