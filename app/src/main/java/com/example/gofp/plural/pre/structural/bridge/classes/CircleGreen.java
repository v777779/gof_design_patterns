package com.example.gofp.plural.pre.structural.bridge.classes;


import com.example.gofp.binding.Systems;

public class CircleGreen extends Shape {

    @Override
    public void applyColor() {
        Systems.out.println(getClass().getSimpleName()+" applied green color");
    }
}
