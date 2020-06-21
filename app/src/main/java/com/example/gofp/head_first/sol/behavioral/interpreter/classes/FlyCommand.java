package com.example.gofp.head_first.sol.behavioral.interpreter.classes;

public class FlyCommand implements  Expression{
    @Override
    public Object interpret(String context) {

        return "fly".equals(context.trim().toLowerCase());
    }
}
