package com.example.gofp.head_first.pre.structural.decorator.classes;

public class HouseBlendWithMilk extends Beverage {
    public HouseBlendWithMilk() {
        description = getClass().getSimpleName();
    }

    @Override
    public float cost() {
        return 1.21f + 0.40f;
    }
}
