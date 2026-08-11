package com.example.behavior.ChainOfResponsibilty.ConcreteHandlers;

import com.example.behavior.ChainOfResponsibilty.Request;
import com.example.behavior.ChainOfResponsibilty.RequestHandler;

public class RateLimitHandler extends RequestHandler {
    @Override
    public boolean handle(Request request){
        System.out.println("Checking Rate Limit");
        if (request.token==null || request.token.isEmpty()){
            System.out.println("Blocked invalid token ");
            return false;
        }
        return super.handle(request);
    }
}
