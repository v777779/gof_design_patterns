package com.example.gofp.head_first.sol.behavioral.strategy.classes;

import com.example.gofp.binding.Systems;

public class FlyRocket implements FlyBehaviour{
    @Override
    public void fly() {
        Systems.out.println("fly as rocket");
    }
}
