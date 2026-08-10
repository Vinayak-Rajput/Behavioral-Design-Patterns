package com.example.behavior.Observer.ConcreteObservers;

import com.example.behavior.Observer.ObserverInterface.Observer;

public class SmsNotifier implements Observer {
    @Override
    public void updateRcvMsg(String message) {
        System.out.println("SMS Message: "+ message);
    }
}
