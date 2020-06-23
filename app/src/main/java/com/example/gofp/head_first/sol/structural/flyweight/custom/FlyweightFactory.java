package com.example.gofp.head_first.sol.structural.flyweight.custom;

public interface FlyweightFactory {
    Flower getFlyweight(String name);

    int getFlyweightsNumber();

}
