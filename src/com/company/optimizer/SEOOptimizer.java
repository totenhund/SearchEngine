package com.company.optimizer;
import com.company.database.DatabaseManager;
import com.company.website.Website;

/**
 * The type Seo optimizer.
 */
public class SEOOptimizer {
    
    private DatabaseManager database;
    /**
     * Add website to database.
     *
     * @param site the site
     */

    
    public void addWebsiteToDatabase(Website site){
        database.putWebsite(site);
    }

    /**
     * Return seo statistics string.
     *
     * @param site the site
     * @return the string
     */

    public String returnSEOStatistics(Website site){
        return site.toString();
    }

    /**
     * Return seo recommendations string.
     *
     * @param site the site
     * @return the string
     */
    public String returnSEORecommendations(Website site){
        return site.toString();
    }
}
