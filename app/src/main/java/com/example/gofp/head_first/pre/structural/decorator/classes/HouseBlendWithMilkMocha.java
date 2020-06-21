package com.example.gofp.head_first.pre.structural.decorator.classes;

public class HouseBlendWithMilkMocha extends Beverage {
    public HouseBlendWithMilkMocha() {
        description = getClass().getSimpleName();
    }

    @Override
    public float cost() {
        return 1.21f + 0.40f + 0.60f;
    }
}
