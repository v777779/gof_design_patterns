package com.example.gofp.plural.pre.structural.bridge.classes;


import com.example.gofp.binding.Systems;

public class CircleRed extends Shape {

    @Override
    public void applyColor() {
        Systems.out.println(getClass().getSimpleName()+" applied red color");
    }
}
