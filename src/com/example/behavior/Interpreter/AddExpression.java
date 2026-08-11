package com.example.behavior.Interpreter;

public class AddExpression implements Expression{
    public final Expression left;
    public final Expression right;

    public AddExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() + right.interpret();
    }
}
