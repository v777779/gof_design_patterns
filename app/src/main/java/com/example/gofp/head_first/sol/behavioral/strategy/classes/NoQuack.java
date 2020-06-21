package com.example.gofp.head_first.sol.behavioral.strategy.classes;

import com.example.gofp.binding.Systems;

public class NoQuack implements QuackBehaviour{

    @Override
    public void quack() {
        Systems.out.println("can't quack");
    }
}
