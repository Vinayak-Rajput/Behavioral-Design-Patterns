package com.example.behavior.Strategy.Context;

import com.example.behavior.Strategy.StrategyInterface.PaymentStrategy;

public class ShoppingCart {
    private int totalAmount = 0;
    private PaymentStrategy paymentStrategy;

    public void addItem(int price){
        this.totalAmount += price;
    }

    public void checkOut(){
        if(paymentStrategy == null){
            System.out.println("Please select one Payment method.");
            return;
        }
        paymentStrategy.pay(totalAmount);
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy =paymentStrategy;
    }
}
