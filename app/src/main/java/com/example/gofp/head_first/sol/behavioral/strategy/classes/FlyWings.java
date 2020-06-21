package com.example.gofp.head_first.sol.behavioral.strategy.classes;

import com.example.gofp.binding.Systems;

public class FlyWings implements FlyBehaviour{
    @Override
    public void fly() {
        Systems.out.println("fly with wings");
    }
}
