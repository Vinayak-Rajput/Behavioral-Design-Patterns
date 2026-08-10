package com.example.behavior.Strategy.ConcreteStrategies;

import com.example.behavior.Strategy.StrategyInterface.PaymentStrategy;

public class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Paypal.");
    }
}
