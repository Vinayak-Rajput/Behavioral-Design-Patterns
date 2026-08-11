package com.example.behavior.Visitor;

public class Book implements ItemElement{
    private double price;
    private String isbn;

    public Book(double price, String isbn) {
        this.price = price;
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public void accept(ShoppingCartVisitor visitor) {
        visitor.visit(this);
    }
}
