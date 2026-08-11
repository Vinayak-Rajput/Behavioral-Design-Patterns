package com.example.behavior.Visitor;

public class Electronics implements ItemElement{

    private double price;
    private String brand;

    public Electronics( double price, String brand) {
        this.brand = brand;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public void accept(ShoppingCartVisitor visitor) {
        visitor.visit(this);
    }
}
