package com.company.users;

import com.company.accessHandler.AuthHandler;
import com.company.accessHandler.WebsiteContentHandler;
import com.company.accessHandler.requests.Request;
import com.company.database.UserAuthenticationManager;
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
    private String hashedPassword;
    private String login;

    /**
     * Instantiates a new Website owner.
     *
     * @param login    the login
     * @param password the password
     */
    public WebsiteOwner(String login, String password) {
        this.login = login;
        this.hashedPassword = password;
        attachedWebsites = new ArrayList<Website>();
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
