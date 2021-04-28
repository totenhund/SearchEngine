package com.company.SearchEngine;
import com.company.website.Website;
import com.company.database.DatabaseManager;

import java.util.ArrayList;

/**
 * The type Search engine.
 */
public class SearchEngine{

    private DatabaseManager database;

    private volatile static SearchEngine searchEngine;
    private SearchEngine(){}

    /**
     * Get instance search engine.
     *
     * @return the search engine
     */
    public static SearchEngine getInstance(){
        if(searchEngine != null){
            synchronized (SearchEngine.class){
                if(searchEngine != null){
                    searchEngine = new SearchEngine();
                }
            }
        }
        return searchEngine;
    }

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
