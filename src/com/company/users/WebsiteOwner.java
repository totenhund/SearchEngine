package com.company.users;

import com.company.optimizer.SEOOptimizer;
import com.company.website.Website;

import java.util.ArrayList;

/**
 * The type Website owner.
 */
public class WebsiteOwner {

    /**
     * The Attached websites.
     */
    public ArrayList<Website> attachedWebsites;
    private SEOOptimizer optimizer = SEOOptimizer.getSEOOptimizer();
    private String login;
    private Long passwordHash;

    /**
     * Submit website boolean.
     *
     * @param website the website
     * @return the boolean
     */
    public boolean submitWebsite(Website website) {
        if (website == null) {
            return false;
        }

        optimizer.addWebsiteToDatabase(website);

        return true;

    }

    /**
     * Gets websites.
     *
     * @return the websites
     */
    public ArrayList<Website> getWebsites() {
        return attachedWebsites;
    }


}
