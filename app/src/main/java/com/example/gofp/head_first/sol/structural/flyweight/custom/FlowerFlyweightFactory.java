package com.example.gofp.head_first.sol.structural.flyweight.custom;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class FlowerFlyweightFactory implements FlyweightFactory{
    private final HashMap<String, Flower> map;

    public FlowerFlyweightFactory() {
        this.map = new HashMap<>();
    }

    @Override
    public Flower getFlyweight(String name) {
        Flower flower = map.get(name);
        if (flower == null) {
            flower = new FlowerFlyweight(name);
            map.put(name, flower);
        }
        return flower;
    }

    @Override
    public int getFlyweightsNumber() {
        return map.size();
    }

}