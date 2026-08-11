package com.example.behavior.ChainOfResponsibilty;

import com.example.behavior.ChainOfResponsibilty.ConcreteHandlers.AuthenticationHandler;
import com.example.behavior.ChainOfResponsibilty.ConcreteHandlers.RateLimitHandler;
import com.example.behavior.ChainOfResponsibilty.ConcreteHandlers.ValidationHandler;

public class ApiServer {
    static void main() {
        RequestHandler rateLimiter = new RateLimitHandler();
        RequestHandler authenticator = new AuthenticationHandler();
        RequestHandler validator = new ValidationHandler();

        rateLimiter.setNext(authenticator);
        authenticator.setNext(validator);

        System.out.println("Request 1");

        Request validReq = new Request("valid_token","{'data':'update'}");
        boolean isSuccess1 = rateLimiter.handle(validReq);

        System.out.println("Request 1 Success: "+ isSuccess1);

        System.out.println("Request 2");

        Request spamReq = new Request("spam_token","{'data': 'hack'}");
        boolean isSuccess2 = rateLimiter.handle(spamReq);

        System.out.println("Request 2 Success: "+ isSuccess2);
    }
}
