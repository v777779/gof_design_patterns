package com.example.gofp.head_first.sol.behavioral.strategy.classes;

import com.example.gofp.binding.Systems;

public class RubberDuck extends Duck {

    public RubberDuck() {
        this.quackBehaviour = new Quack();
        this.flyBehaviour = new NoFly();
        this.swimBehaviour = new Swim();
    }

    @Override
    public void display() {
        Systems.out.println("Rubber Duck");
    }
}
