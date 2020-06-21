package com.example.gofp.head_first.sol.behavioral.interpreter.classes;

public class RightCommand implements  Expression{
    @Override
    public Object interpret(String context) {

        return "right".equals(context.trim().toLowerCase());
    }
}
