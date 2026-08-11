package com.example.behavior.Visitor;

public class VisitorDemo {
    static void main() {
        ItemElement[] items = new ItemElement[]{
                new Book(20, "ISBN: 112233"),
                new Electronics(800,"Sony"),
                new Book(40,"ISBN 345678")
        };

        TaxCalculatorVisitor taxVisitor = new TaxCalculatorVisitor();

        System.out.println("Calcualting Taxes");
        for(ItemElement item : items){
            item.accept(taxVisitor);
        }

        System.out.println("Total Cart Tax: "+taxVisitor.getTotalTax());


    }
}
