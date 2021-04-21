package com.company.website;

import java.util.ArrayList;
import java.util.HashMap;


public class MetaData {
    public HashMap<String, ArrayList<String>> metaTags;

    public MetaData(ArrayList<String> keywords, ArrayList<String> description){
        this.metaTags = new HashMap<String, ArrayList<String>>();
        this.metaTags.put(MetaTagsNames.KEYWORDS.name(), keywords);
        this.metaTags.put(MetaTagsNames.DESCRIPTION.name(), description);
    }

    public void changeKeywords(ArrayList<String> keywords){
        this.metaTags.put(MetaTagsNames.KEYWORDS.name(), keywords);
    }

    public void changeDescription(ArrayList<String> description){
        this.metaTags.put(MetaTagsNames.DESCRIPTION.name(), description);
    }

}
