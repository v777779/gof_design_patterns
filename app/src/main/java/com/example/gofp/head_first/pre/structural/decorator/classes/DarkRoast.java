package com.example.gofp.head_first.pre.structural.decorator.classes;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = getClass().getSimpleName();
    }

    @Override
    public float cost() {
        return 1.08f;
    }
}
