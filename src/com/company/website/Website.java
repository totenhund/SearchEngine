package com.company.website;

import java.util.ArrayList;

/**
 * The type Website.
 */
public class Website {
    /**
     * The Url.
     */
    public String url;
    /**
     * The Meta data.
     */
    public MetaData metaData;
    /**
     * The Rating.
     */
    public Float rating;

    /**
     * Instantiates a new Website.
     *
     * @param url         the url
     * @param description the description
     * @param keywords    the keywords
     * @param rating      the rating
     */
    public Website(String url, ArrayList<String> description, ArrayList<String> keywords, Float rating) {
        this.url = url;
        this.metaData = new MetaData(keywords, description);
        this.rating = rating;
    }

    /**
     * Instantiates a new Website.
     *
     * @param url         the url
     * @param description the description
     * @param keywords    the keywords
     */
    public Website(String url, ArrayList<String> description, ArrayList<String> keywords) {
        this.url = url;
        this.metaData = new MetaData(keywords, description);
        this.rating = 0f;
    }
}
