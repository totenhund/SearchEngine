package com.company.database;

public class DatabaseManager {

    private static DatabaseManager instance;

    private DatabaseManager() {
    }

    public static DatabaseManager getInstance() {
        if (instance == null) {
            instance = new DatabaseManager();
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
