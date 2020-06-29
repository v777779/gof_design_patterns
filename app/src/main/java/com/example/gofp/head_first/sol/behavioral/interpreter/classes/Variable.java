package com.example.gofp.head_first.sol.behavioral.interpreter.classes;

import java.util.List;
import java.util.StringTokenizer;

public class Variable implements Expression {
    private List<Expression> expressions;

    public Variable(List<Expression> expressions) {
        this.expressions = expressions;
    }

    @Override
    public Object interpret(String context) {
        int count = 0;

        StringTokenizer tokenizer = new StringTokenizer(context);
        while (tokenizer.hasMoreElements()) {
            String token = tokenizer.nextToken();

            if (!isMatch(token)) {
                break;
            }
            count++;
        }
        return count;
    }

    private boolean isMatch(String token){
        if(token == null){
            return false;
        }

        for (Expression expression : expressions) {
            if((boolean)expression.interpret(token)){
                return true;
            }
        }
        return false;
    }
}
