package com.example.behavior.Strategy.ConcreteStrategies;

import com.example.behavior.Strategy.StrategyInterface.PaymentStrategy;

public class CreditCardPayment implements PaymentStrategy {
    private String name;
    private String cardNumber;

    public CreditCardPayment(String name, String cardNumber){
        this.name = name;
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println( amount + "paid using CreditCard");
    }
}
