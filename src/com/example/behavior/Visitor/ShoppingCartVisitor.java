package com.example.behavior.Visitor;

public interface ShoppingCartVisitor {
    void visit(Book book);
    void visit(Electronics electronics);
}
