package com.example.gofp.head_first.sol.structural.flyweight.custom;

import com.example.gofp.binding.Systems;

import java.util.Locale;

public class FlowerFlyweight implements Flower{
    private String name;


    public FlowerFlyweight(String name) {
        this.name = name;
    }

    @Override
    public String display() {
        return name;
    }
}
