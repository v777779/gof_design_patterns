package com.example.gofp.head_first.pre.structural.decorator.classes;

public class DecafWithMilk extends Beverage {
    public DecafWithMilk() {
        description = getClass().getSimpleName();
    }

    @Override
    public float cost() {
        return 0.81f+0.40f;
    }
}
