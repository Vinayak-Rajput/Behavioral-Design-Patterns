package com.example.behavior.ChainOfResponsibilty.ConcreteHandlers;

import com.example.behavior.ChainOfResponsibilty.Request;
import com.example.behavior.ChainOfResponsibilty.RequestHandler;

public class AuthenticationHandler extends RequestHandler {
    @Override
    public boolean handle(Request request){
        System.out.println("Authenticating Token");
        if(!request.token.equals("valid_token")){
            System.out.println("Blocked: Authentication failed");
            return false;
        }
        return super.handle(request);
    }
}
