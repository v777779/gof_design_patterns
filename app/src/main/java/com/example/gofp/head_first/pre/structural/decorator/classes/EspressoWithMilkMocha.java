package com.example.gofp.head_first.pre.structural.decorator.classes;

public class EspressoWithMilkMocha extends Beverage {
    public EspressoWithMilkMocha() {
        description = getClass().getSimpleName();
    }

    @Override
    public float cost() {
        return 2.15f+0.40f+0.60f;
    }
}
