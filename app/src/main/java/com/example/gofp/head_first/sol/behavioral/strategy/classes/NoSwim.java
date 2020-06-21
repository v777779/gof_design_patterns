package com.example.gofp.head_first.sol.behavioral.strategy.classes;

import com.example.gofp.binding.Systems;

public class NoSwim implements SwimBehaviour{

    @Override
    public void swim() {
        Systems.out.println("can't swim");
    }
}
