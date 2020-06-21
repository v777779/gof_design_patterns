package com.example.gofp.plural.sol.structural.bridge.classes;

import com.example.gofp.binding.Systems;

public class Red implements Color {
    @Override
    public void applyColor() {
        Systems.out.println("red color");
    }
}
