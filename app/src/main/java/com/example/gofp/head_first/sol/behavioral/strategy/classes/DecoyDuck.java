package com.example.gofp.head_first.sol.behavioral.strategy.classes;

import com.example.gofp.binding.Systems;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        this.quackBehaviour = new Squeak();
        this.flyBehaviour = new NoFly();
        this.swimBehaviour = new NoSwim();
    }

    @Override
    public void display() {
        Systems.out.println("Decoy Duck");
    }
}
