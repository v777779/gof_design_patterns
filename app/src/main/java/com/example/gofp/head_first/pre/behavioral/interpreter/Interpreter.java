package com.example.gofp.head_first.pre.behavioral.interpreter;

import com.example.gofp.binding.BasePattern;
import com.example.gofp.binding.Systems;
import com.example.gofp.head_first.pre.behavioral.interpreter.classes.Repetition;
import com.example.gofp.head_first.pre.behavioral.interpreter.classes.Sequence;

public class Interpreter extends BasePattern {
    @Override
    public void main() {

        Sequence sequence = new Sequence(new String[]{"fly", "right" });
        String context = "fly right";
        Systems.out.println("Interpret sequence: " + context);
        Systems.out.println(sequence.interpret(context));

        context = "fly quack";
        Systems.out.println("Interpret sequence: " + context);
        Systems.out.println(sequence.interpret(context));


        Repetition repetition = new Repetition(3, "quack");
        context = "quack quack quack";
        Systems.out.println("Interpret repetition: " + context);
        Systems.out.println(repetition.interpret(context));

        context = "squeak quack quack";
        Systems.out.println("Interpret repetition: " + context);
        Systems.out.println(repetition.interpret(context));
    }
}
