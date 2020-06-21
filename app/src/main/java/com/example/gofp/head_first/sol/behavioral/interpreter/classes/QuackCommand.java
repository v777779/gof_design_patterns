package com.example.gofp.head_first.sol.behavioral.interpreter.classes;

public class QuackCommand implements  Expression{
    @Override
    public Object interpret(String context) {

        return "quack".equals(context.trim().toLowerCase());
    }
}
