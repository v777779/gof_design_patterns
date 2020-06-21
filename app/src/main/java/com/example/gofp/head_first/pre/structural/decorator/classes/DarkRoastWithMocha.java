package com.example.gofp.head_first.pre.structural.decorator.classes;

public class DarkRoastWithMocha extends Beverage {
    public DarkRoastWithMocha() {
        description = getClass().getSimpleName();
    }

    @Override
    public float cost() {
        return 1.08f + 0.60f;
    }
}
