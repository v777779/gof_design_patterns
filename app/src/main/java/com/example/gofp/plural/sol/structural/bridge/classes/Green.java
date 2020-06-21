package com.example.gofp.plural.sol.structural.bridge.classes;

import com.example.gofp.binding.Systems;

public class Green implements Color {
    @Override
    public void applyColor() {
        Systems.out.println("green color");
    }
}
