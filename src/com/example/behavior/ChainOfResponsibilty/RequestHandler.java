package com.example.behavior.ChainOfResponsibilty;

public abstract class RequestHandler {
    private RequestHandler nextHandler;

    public void setNext(RequestHandler requestHandler){
        this.nextHandler =  nextHandler;
    }

    public boolean handle(Request request){ //default return value is false

        if(nextHandler != null){
            return nextHandler.handle(request);
        }
        return true;
    }
}
