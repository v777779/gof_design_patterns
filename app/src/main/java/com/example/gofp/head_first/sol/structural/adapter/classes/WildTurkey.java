package com.example.gofp.head_first.sol.structural.adapter.classes;

import com.example.gofp.binding.Systems;

public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        Systems.out.println("gobble");
    }

    @Override
    public void fly() {
        Systems.out.println("fly");
    }
}
