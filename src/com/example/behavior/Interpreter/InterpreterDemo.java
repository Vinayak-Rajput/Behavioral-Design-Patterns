package com.example.behavior.Interpreter;

public class InterpreterDemo {
    static void main() {
        Expression num10 = new NumberExpression(10);
        Expression num5 = new NumberExpression(5);
        Expression num3 = new NumberExpression(3);

        Expression add = new AddExpression(num10, num5);
        Expression syntaxTree = new SubtractExpression(add, num3);

        System.out.print(syntaxTree.interpret());
    }
}
