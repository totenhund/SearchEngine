package com.company.users;

import com.company.website.Website;
import java.util.ArrayList;

public class WebsiteOwner {

    public ArrayList<Website> attachedWebsites;
    private String login;
    private Long passwordHash;

    public boolean submitWebsite(Website website){
        if(website == null){
            return false;
        }

        attachedWebsites.add(website);

        return true;

    }

    public ArrayList<Website> getWebsites(){
        return attachedWebsites;
    }


}
