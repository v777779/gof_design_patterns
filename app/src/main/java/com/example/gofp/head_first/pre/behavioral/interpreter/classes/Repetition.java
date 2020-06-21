package com.example.gofp.head_first.pre.behavioral.interpreter.classes;

import com.example.gofp.head_first.sol.behavioral.interpreter.classes.Expression;

import java.util.StringTokenizer;

public class Repetition implements Expression {
    private int variable;
    private String search;

    public Repetition(int variable, String search) {
        this.variable = variable;
        this.search = search;
    }

    @Override
    public Object interpret(String context) {
        if (variable == 0) {
            return false;
        }
        StringTokenizer tokenizer = new StringTokenizer(context);
        while (variable > 0 && tokenizer.hasMoreTokens()) {

            if (!search.equals(tokenizer.nextToken())) {
                break;
            }
            variable--;
        }
        return variable == 0;
    }
}
