package com.example.behavior.Visitor;

public class TaxCalculatorVisitor implements ShoppingCartVisitor{

    private double totalTax = 0;

    @Override
    public void visit(Book book) {
        double tax = book.getPrice() * 0.05;
        System.out.println("Book ["+book.getIsbn()+"] Tax: $"+tax);
        totalTax+=tax;
    }

    @Override
    public void visit(Electronics electronics) {
        double tax = electronics.getPrice() * 0.08;
        System.out.println("Elecronics ["+electronics.getBrand()+"] Tax: $"+tax);
        totalTax+=tax;
    }

    public double getTotalTax(){
        return totalTax;
    }
}
