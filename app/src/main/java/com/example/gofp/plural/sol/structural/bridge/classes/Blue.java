package com.example.gofp.plural.sol.structural.bridge.classes;

import com.example.gofp.binding.Systems;

public class Blue implements Color {
    @Override
    public void applyColor() {
        Systems.out.println("blue color");
    }
}
