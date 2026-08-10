package com.example.behavior.Strategy.ConcreteStrategies;

import com.example.behavior.Strategy.StrategyInterface.PaymentStrategy;

public class UPIPayment implements PaymentStrategy {
    private String upiId;
    private String name;

    public UPIPayment(String upiId, String name) {
        this.upiId = upiId;
        this.name = name;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount+ " paid using UPI");
    }
}
