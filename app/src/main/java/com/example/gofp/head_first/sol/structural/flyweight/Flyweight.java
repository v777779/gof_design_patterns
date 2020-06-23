package com.example.gofp.head_first.sol.structural.flyweight;

import com.example.gofp.binding.BasePattern;
import com.example.gofp.binding.Systems;
import com.example.gofp.head_first.sol.structural.flyweight.classes.TreeManager;
import com.example.gofp.head_first.sol.structural.flyweight.custom.Flower;
import com.example.gofp.head_first.sol.structural.flyweight.custom.FlowerFlyweightFactory;
import com.example.gofp.head_first.sol.structural.flyweight.custom.FlowerManager;
import com.example.gofp.head_first.sol.structural.flyweight.custom.FlyweightFactory;

import java.util.ArrayList;
import java.util.List;

public class Flyweight extends BasePattern {
    @Override
    public void main() {
// classes
        TreeManager manager = new TreeManager();
        Systems.out.println("Garden:");
        manager.displayTrees();
        Systems.out.println("Flyweights number: 1");
        Systems.out.println();

// custom

        FlyweightFactory factory = new FlowerFlyweightFactory();
        FlowerManager flowerManager = new FlowerManager(factory);
        Systems.out.println("Flowers:");
        flowerManager.displayFlowers();
        Systems.out.println("Flyweights number: "+factory.getFlyweightsNumber());


    }
}
