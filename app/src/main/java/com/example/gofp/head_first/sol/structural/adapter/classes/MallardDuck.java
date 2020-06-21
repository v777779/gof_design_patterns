package com.example.gofp.head_first.sol.structural.adapter.classes;

import com.example.gofp.binding.Systems;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        Systems.out.println("quack");
    }

    @Override
    public void fly() {
        Systems.out.println("fly long");
    }
}
