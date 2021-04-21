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

    public Website getWebsite(String url){

    }
    
    public void postWebsite(Website website){

    }
    
    public void updateRating(Website website, Int rating){

    }
    
    public void putWebsite(Website website){

    }
    
    public Website deleteWebsite(Website website){

    }
}
