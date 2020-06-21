package com.example.gofp.head_first.pre.behavioral.strategy.classes;

import com.example.gofp.binding.Systems;

public class RubberDuck extends Duck implements Quackable, Swimmable {

    @Override
    public void quack() {
        Systems.out.println("quack");
    }

    @Override
    public void swim() {
        Systems.out.println("swim");
    }
}
