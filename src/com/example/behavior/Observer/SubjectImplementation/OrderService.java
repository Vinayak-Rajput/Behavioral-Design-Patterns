package com.example.behavior.Observer.SubjectImplementation;

import com.example.behavior.Observer.ObserverInterface.Observer;
import com.example.behavior.Observer.SubjectInterface.Subject;

import java.util.ArrayList;
import java.util.List;

public class OrderService implements Subject {

    private List<Observer> observers = new ArrayList<>();

    public void placeOrder(int orderId){
        System.out.println("Order Placed ");
        notifyObservers("Order# "+orderId + " placed");
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String msg) {
        for(Observer observer: observers){
            observer.updateRcvMsg(msg);
        }
    }
}
