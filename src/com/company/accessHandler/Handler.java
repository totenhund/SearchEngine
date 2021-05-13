package com.company.accessHandler;


import com.company.accessHandler.requests.Request;

/**
 * The interface Handler.
 */
public interface Handler {
    /**
     * Handle request
     *
     * @param request the request
     * @return the boolean
     */
    boolean handle(Request request);

    /**
     * Sets next handler
     *
     * @param h the h
     */
    void setNext(Handler h);

    /**
     * Check next handler
     *
     * @param request the request
     * @return the boolean
     */
    boolean checkNext(Request request);
}
