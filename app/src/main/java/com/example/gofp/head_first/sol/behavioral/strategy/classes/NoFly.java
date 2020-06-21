package com.example.gofp.head_first.sol.behavioral.strategy.classes;

import com.example.gofp.binding.Systems;

public class NoFly implements FlyBehaviour{
    @Override
    public void fly() {
        Systems.out.println("can't fly");
    }
}
