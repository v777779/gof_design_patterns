package com.example.gofp.head_first.sol.behavioral.strategy.classes;

import com.example.gofp.binding.Systems;

public class Quack implements QuackBehaviour{

    @Override
    public void quack() {
        Systems.out.println("quack");
    }
}
