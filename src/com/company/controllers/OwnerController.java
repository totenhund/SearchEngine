package com.company.controllers;

import com.company.accessHandler.AuthHandler;
import com.company.accessHandler.WebsiteContentHandler;
import com.company.accessHandler.requests.Request;
import com.company.database.UserAuthenticationManager;
import com.company.optimizer.SEOOptimizer;
import com.company.users.WebsiteOwner;
import com.company.website.Website;

public class OwnerController {

    private SEOOptimizer optimizer = SEOOptimizer.getSEOOptimizer();
    private UserAuthenticationManager authManager = UserAuthenticationManager.getInstance();

    public boolean register(String login, String password) {
        WebsiteOwner owner = new WebsiteOwner(login, password);
        return authManager.registerUser(owner);
    }

    public boolean signIn(String login, String password) {
        AuthHandler authHandler = new AuthHandler();
        return authHandler.handle(new Request(login, password));
    }


    public boolean submitWebsite(Website website, String login, String password) {
        if (website == null) {
            return false;
        }

        AuthHandler authHandler = new AuthHandler();
        WebsiteContentHandler websiteContentHandler = new WebsiteContentHandler();
        authHandler.setNext(websiteContentHandler);

        Request request = new Request(login, password, website);

        if (authHandler.handle(request)) {
            optimizer.addWebsiteToDatabase(website);
            return true;
        }

        return true;

    }

}
