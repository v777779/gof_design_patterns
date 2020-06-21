package com.example.gofp.head_first.sol.behavioral.interpreter.classes;

import java.util.StringTokenizer;

public class Sequence implements Expression {
    private Expression expression1;
    private Expression expression2;

    public Sequence(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public Object interpret(String context) {
        StringTokenizer tokenizer = new StringTokenizer(context);
        if (!tokenizer.hasMoreTokens()) {
            return false;
        }
        Object result = expression1.interpret(tokenizer.nextToken());
        if (result == null || !tokenizer.hasMoreTokens()) {
            return false;
        }
        result = expression2.interpret(tokenizer.nextToken());

        return result;
    }

}
