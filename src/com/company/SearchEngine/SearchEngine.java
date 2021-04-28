package com.company.SearchEngine;
import com.company.website.Website;
import com.company.database.DatabaseManager;

import java.util.ArrayList;

/**
 * The type Search engine.
 */
public class SearchEngine{

    private DatabaseManager database;

    private ArrayList<Website> sendQuery(String processedQuery){
        return database.getWebsites(processedQuery);
    }

    /**
     * Get websites array list.
     *
     * @param query the query
     * @return the array list
     */
    public ArrayList<Website> getWebsites(String query){
        return sendQuery(query);
    }
}
