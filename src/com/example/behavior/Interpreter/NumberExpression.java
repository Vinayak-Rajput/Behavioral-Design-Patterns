package com.example.behavior.Interpreter;

public class NumberExpression implements Expression{

    public final int number;

    public NumberExpression(int number){
        this.number = number;
    }

    @Override
    public int interpret() {
        return number;
    }
}
