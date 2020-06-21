package com.example.gofp.head_first.sol.structural.decorator.classes;


public class DarkRoast extends Beverage {

    public DarkRoast() {
        this.description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return 0.99;
    }


}
