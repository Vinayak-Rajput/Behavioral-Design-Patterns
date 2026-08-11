package com.example.behavior.Iterator;

public class IteratorDemo {
    static void main() {
        NotificationCollection nc = new NotificationCollection(5);

        nc.addItem("N1: System update available");
        nc.addItem("N2: New Message received");
        nc.addItem("N3: Security Alert");

        Iterator<String> iterator = nc.createIterator();
        System.out.println("---Reading Notifications ---");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
