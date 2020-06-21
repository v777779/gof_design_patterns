package com.example.gofp.head_first.sol.behavioral.interpreter.classes;

import java.util.StringTokenizer;

public class Repetition implements Expression {
    private Expression variable;
    private Expression expression;

    public Repetition(Expression variable, Expression expression) {
        this.variable = variable;
        this.expression = expression;
    }

    @Override
    public Object interpret(String context) {
        Integer variable = (Integer) this.variable.interpret(context);
        if (variable == null || variable == 0) {
            return false;
        }
        StringTokenizer tokenizer = new StringTokenizer(context);

        while (variable > 0 && tokenizer.hasMoreTokens()) {
            if (expression.interpret(tokenizer.nextToken()) == null) {
                break;
            }
            variable--;
        }
        return variable == 0;
    }
}
