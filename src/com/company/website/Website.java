package com.company.website;

import java.util.ArrayList;

public class Website {
    public String url;
    public MetaData metaData;
    public Float rating;

    public Website(String url, ArrayList<String> description, ArrayList<String> keywords, Float rating){
        this.url = url;
        this.metaData = new MetaData(keywords, description);
        this.rating = rating;
    }

    public Website(String url, ArrayList<String> description, ArrayList<String> keywords){
        this.url = url;
        this.metaData = new MetaData(keywords, description);
        this.rating = 0f;
    }
}
