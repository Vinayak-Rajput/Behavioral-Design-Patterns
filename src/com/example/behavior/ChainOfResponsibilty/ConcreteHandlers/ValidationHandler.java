package com.example.behavior.ChainOfResponsibilty.ConcreteHandlers;

import com.example.behavior.ChainOfResponsibilty.Request;
import com.example.behavior.ChainOfResponsibilty.RequestHandler;

public class ValidationHandler extends RequestHandler {
    @Override
    public boolean handle(Request request){
        System.out.println("Validating payload data");
        if(request.payload == null){
            System.out.println("Blocked: Invalid Payload");
            return false;
        }
        return super.handle(request);
    }
}
