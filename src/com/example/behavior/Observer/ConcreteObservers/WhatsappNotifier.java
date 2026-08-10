package com.example.behavior.Observer.ConcreteObservers;

import com.example.behavior.Observer.ObserverInterface.Observer;

public class WhatsappNotifier implements Observer {
    @Override
    public void updateRcvMsg(String message) {
        System.out.println("Whatsapp Msg: "+message);
    }
}
