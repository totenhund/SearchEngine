package com.company.accessHandler.requests;

import com.company.website.Website;

/**
 * The type Request.
 */
public class Request {
    private String typedPassword;
    private String typedLogin;
    private Website website;

    /**
     * Instantiates a new Request.
     *
     * @param typedPassword the typed password
     * @param typedLogin    the typed login
     * @param website       the website
     */
    public Request(String typedPassword, String typedLogin, Website website) {
        this.typedPassword = typedPassword;
        this.typedLogin = typedLogin;
        this.website = website;
    }

    /**
     * Instantiates a new Request.
     *
     * @param typedPassword the typed password
     * @param typedLogin    the typed login
     */
    public Request(String typedPassword, String typedLogin){
        this.typedPassword = typedPassword;
        this.typedLogin = typedLogin;
    }

    /**
     * Gets typed password.
     *
     * @return the typed password
     */
    public String getTypedPassword() {
        return typedPassword;
    }

    /**
     * Sets typed password.
     *
     * @param typedPassword the typed password
     */
    public void setTypedPassword(String typedPassword) {
        this.typedPassword = typedPassword;
    }

    /**
     * Gets typed login.
     *
     * @return the typed login
     */
    public String getTypedLogin() {
        return typedLogin;
    }

    /**
     * Sets typed login.
     *
     * @param typedLogin the typed login
     */
    public void setTypedLogin(String typedLogin) {
        this.typedLogin = typedLogin;
    }

    /**
     * Gets website.
     *
     * @return the website
     */
    public Website getWebsite() {
        return website;
    }

    /**
     * Sets website.
     *
     * @param website the website
     */
    public void setWebsite(Website website) {
        this.website = website;
    }
}
