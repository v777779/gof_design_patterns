package com.example.gofp.head_first.pre.structural.decorator.classes;

public class Decaf extends Beverage {
    public Decaf() {
        description = getClass().getSimpleName();
    }

    @Override
    public float cost() {
        return 0.81f;
    }
}
