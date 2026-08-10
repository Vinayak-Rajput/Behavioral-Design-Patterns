package com.example.behavior.Observer.ConcreteObservers;

import com.example.behavior.Observer.ObserverInterface.Observer;

public class EmailNotifier implements Observer {
    @Override
    public void updateRcvMsg(String message) {
        System.out.println("Email Msg: "+message);
    }
}
