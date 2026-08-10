package com.example.behavior.Observer.SubjectInterface;

import com.example.behavior.Observer.ObserverInterface.Observer;

public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(String msg);
}
