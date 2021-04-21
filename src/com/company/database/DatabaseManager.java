package com.company.database;

import com.company.website.Website;

/**
 * The type Database manager.
 */
public class DatabaseManager {

    private static DatabaseManager instance;

    private DatabaseManager() {
    }

    /**
     * Gets instance.
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
    public ArrayList<Website> getWebsite(String query){
        return null;
    }

    /**
     * Post website.
     *
     * @param website the website
     */
    public void postWebsite(Website website){

    }

    /**
     * Update rating.
     *
     * @param website the website
     * @param rating  the rating
     */
    public void updateRating(Website website, int rating){

    }

    /**
     * Put website.
     *
     * @param website the website
     */
    public void putWebsite(Website website){

    }

    /**
     * Delete website website.
     *
     * @param website the website
     * @return the website
     */
    public Website deleteWebsite(Website website){
        return website;
    }
}

