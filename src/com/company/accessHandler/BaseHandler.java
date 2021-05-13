package com.company.accessHandler;

import com.company.accessHandler.requests.Request;

/**
 * The type Base handler.
 */
abstract class BaseHandler implements Handler {

    /**
     * The Next.
     */
    Handler next;

    @Override
    public void setNext(Handler h) {
        this.next = h;
    }

    @Override
    public boolean checkNext(Request request) {
        if (next == null){
            return true;
        }
        return next.handle(request);
    }
}
