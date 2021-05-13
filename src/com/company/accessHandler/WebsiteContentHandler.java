package com.company.accessHandler;

import com.company.accessHandler.requests.Request;
import com.company.website.MetaTagsNames;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * The type Website content handler.
 */
public class WebsiteContentHandler extends BaseHandler {

    private ArrayList<String> restrictedTags = new ArrayList<>();

    /**
     * Instantiates a new Website content handler.
     */
    public WebsiteContentHandler() {
        restrictedTags.add("nudity");
    }

    @Override
    public boolean handle(Request request) {

        HashMap<String, ArrayList<String>> mt = request.getWebsite().metaData.metaTags;
        ArrayList<String> keywords = mt.get(MetaTagsNames.KEYWORDS.name());
        ArrayList<String> desc = mt.get(MetaTagsNames.DESCRIPTION.name());




        if (keywords.contains(restrictedTags.get(0))) {
            System.out.println("Keywords tags contains prohibited tags: " + restrictedTags.get(0));
            return false;
        }

        if (desc.contains(restrictedTags.get(0))) {
            System.out.println("Description tags contains prohibited tags: " + restrictedTags.get(0));
            return false;
        }

        System.out.println("All tags are ok");
        return checkNext(request);

    }
}
