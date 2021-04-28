package com.company.users;

import com.company.SearchEngine.SearchEngine;
import com.company.website.Website;

import java.util.ArrayList;

/**
 * The type User.
 */
public class User {
    private Long id;

    /**
     * Send requests.
     *
     * @param query the query
     */
    public void sendRequests(String query) {
        SearchEngine search = SearchEngine.getInstance();
        search.getWebsites(query);
    }

}
