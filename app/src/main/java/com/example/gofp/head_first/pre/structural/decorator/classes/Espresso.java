package com.example.gofp.head_first.pre.structural.decorator.classes;

public class Espresso extends Beverage {
    public Espresso() {
        description = getClass().getSimpleName();
    }

    @Override
    public float cost() {
        return 2.15f;
    }
}
