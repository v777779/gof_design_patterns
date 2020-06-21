package com.example.gofp.head_first.sol.behavioral.strategy.classes;

import com.example.gofp.binding.Systems;

public class Squeak implements QuackBehaviour{

    @Override
    public void quack() {
        Systems.out.println("squeak");
    }
}
