package com.example.gofp.head_first.sol.behavioral.strategy.classes;

import com.example.gofp.binding.Systems;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.quackBehaviour = new Quack();
        this.flyBehaviour = new FlyWings();
        this.swimBehaviour = new Swim();
    }

    @Override
    public void display() {
        Systems.out.println("Mallard Duck");
    }
}
