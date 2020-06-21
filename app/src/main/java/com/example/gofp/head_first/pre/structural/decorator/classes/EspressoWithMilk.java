package com.example.gofp.head_first.pre.structural.decorator.classes;

public class EspressoWithMilk extends Beverage {
    public EspressoWithMilk() {
        description = getClass().getSimpleName();
    }

    @Override
    public float cost() {
        return 2.15f+0.40f;
    }
}
