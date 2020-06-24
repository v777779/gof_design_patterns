package com.example.gofp.head_first.sol.structural.flyweight.custom;

import com.example.gofp.binding.Systems;

import java.util.Locale;

public class FlowerFlyweight implements Flower {
    private String name;  // intrinsic parameters


    public FlowerFlyweight(String name) {
        this.name = name;
    }

    @Override
    public void display() {                 // name intrinsic parameters used only
        String s = String.format(Locale.ENGLISH, "%s @%x", name, hashCode());
        Systems.out.println(s);
    }

    @Override
    public void display(int x, int y) {     // x, y extrinsic parameters
        String s = String.format(Locale.ENGLISH, "%s, x: %02d, y: %02d, @%x",
                name, x, y, hashCode());
        Systems.out.println(s);
    }


}
