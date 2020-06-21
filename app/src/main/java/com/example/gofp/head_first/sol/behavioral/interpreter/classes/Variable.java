package com.example.gofp.head_first.sol.behavioral.interpreter.classes;

import java.util.StringTokenizer;

public class Variable implements Expression {

    @Override
    public Object interpret(String context) {
        int count = 0;

        StringTokenizer tokenizer = new StringTokenizer(context);
        while (tokenizer.hasMoreElements()) {
            String token = tokenizer.nextToken();

            if (token == null || !(token.equals("quack") || token.equals("right")
                    || token.equals("fly"))) {
                break;
            }
            count++;
        }
        return count;
    }
}
