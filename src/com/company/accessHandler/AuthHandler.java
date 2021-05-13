package com.company.accessHandler;

import com.company.accessHandler.requests.Request;
import com.company.database.UserAuthenticationManager;

/**
 * The type Auth handler.
 */
public class AuthHandler extends BaseHandler {

    private UserAuthenticationManager authManager =  UserAuthenticationManager.getInstance();

    @Override
    public boolean handle(Request request) {
        if (authManager.checkLogin(request.getTypedLogin()) && authManager.checkPassword(request.getTypedPassword())){
            System.out.println("Success authorization");
            return checkNext(request);
        }else{
            System.out.println("Login or password are not correct");
            return false;
        }
    }
}
