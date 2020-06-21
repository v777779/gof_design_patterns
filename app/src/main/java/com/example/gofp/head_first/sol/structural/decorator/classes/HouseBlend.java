package com.example.gofp.head_first.sol.structural.decorator.classes;


public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.description ="House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }


}
