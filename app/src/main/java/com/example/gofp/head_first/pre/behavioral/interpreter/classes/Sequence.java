package com.example.gofp.head_first.pre.behavioral.interpreter.classes;

import com.example.gofp.head_first.sol.behavioral.interpreter.classes.Expression;

import java.util.StringTokenizer;

public class Sequence implements Expression {
    private String[] search;

    public Sequence(String[] search) {
        this.search = search;
    }

    @Override
    public Object interpret(String context) {
        StringTokenizer tokenizer = new StringTokenizer(context);
        if (!tokenizer.hasMoreTokens()) {
            return false;
        }
        boolean result = search[0].equals(tokenizer.nextToken());
        if (!result) {
            return false;
        }
        return search[1].equals(tokenizer.nextToken());
    }

}
