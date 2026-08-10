package com.example.behavior.Observer;

import com.example.behavior.Observer.ConcreteObservers.EmailNotifier;
import com.example.behavior.Observer.ConcreteObservers.SmsNotifier;

import com.example.behavior.Observer.SubjectImplementation.OrderService;

public class Client {
    static void main() {
        OrderService orderService = new OrderService();

        orderService.registerObserver(new EmailNotifier());

        orderService.registerObserver(new SmsNotifier());

        orderService.notifyObservers("Notification to all");

    }
}
