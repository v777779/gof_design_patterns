package com.example.gofp.head_first.sol.behavioral.interpreter;

import com.example.gofp.binding.BasePattern;
import com.example.gofp.binding.Systems;
import com.example.gofp.head_first.sol.behavioral.interpreter.classes.Expression;
import com.example.gofp.head_first.sol.behavioral.interpreter.classes.FlyCommand;
import com.example.gofp.head_first.sol.behavioral.interpreter.classes.QuackCommand;
import com.example.gofp.head_first.sol.behavioral.interpreter.classes.Repetition;
import com.example.gofp.head_first.sol.behavioral.interpreter.classes.RightCommand;
import com.example.gofp.head_first.sol.behavioral.interpreter.classes.Sequence;
import com.example.gofp.head_first.sol.behavioral.interpreter.classes.Variable;

import java.util.Arrays;

public class Interpreter extends BasePattern {
    @Override
    public void main() {

        Expression quack =  new QuackCommand();
        Expression fly = new FlyCommand();
        Expression right = new RightCommand();
        Expression variable = new Variable(Arrays.asList(quack,fly,right));
        Expression repetition = new Repetition(variable, quack);

        Expression sequence = new Sequence(fly,right);
        String context = "fly right";
        Systems.out.println("Interpret sequence: "+context);
        Systems.out.println(sequence.interpret(context));

        context = "fly quack";
        Systems.out.println("Interpret sequence: "+context);
        Systems.out.println(sequence.interpret(context));

        context = "quack quack quack";
        Systems.out.println("Interpret repetition: "+context);
        Systems.out.println(repetition.interpret(context));

        context = "squeak quack quack";
        Systems.out.println("Interpret repetition: "+context);
        Systems.out.println(repetition.interpret(context));

    }
}
