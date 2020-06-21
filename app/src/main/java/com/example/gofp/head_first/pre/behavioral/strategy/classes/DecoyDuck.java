package com.example.gofp.head_first.pre.behavioral.strategy.classes;

import com.example.gofp.binding.Systems;

public class DecoyDuck extends Duck implements Quackable {


    @Override
    public void quack() {
        Systems.out.println("squeak");
    }
}
