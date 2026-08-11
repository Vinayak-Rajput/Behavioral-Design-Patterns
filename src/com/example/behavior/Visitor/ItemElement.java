package com.example.behavior.Visitor;

public interface ItemElement {
    void accept(ShoppingCartVisitor visitor);
}
