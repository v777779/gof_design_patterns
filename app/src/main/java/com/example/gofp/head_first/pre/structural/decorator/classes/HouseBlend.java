package com.example.gofp.head_first.pre.structural.decorator.classes;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = getClass().getSimpleName();
    }

    @Override
    public float cost() {
        return 1.21f;
    }
}
