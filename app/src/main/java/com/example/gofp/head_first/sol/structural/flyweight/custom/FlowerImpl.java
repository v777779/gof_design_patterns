package com.example.gofp.head_first.sol.structural.flyweight.custom;

import java.util.Locale;

public class FlowerImpl implements  Flower {
    private Flower flyweight;
    private int x;
    private int y;

    public FlowerImpl(Flower flyweight, int x, int y) {
        this.flyweight = flyweight;
        this.x = x;
        this.y = y;
    }

    public String display() {
        return String.format(Locale.ENGLISH, "%s, x: %02d, y: %02d, @%x",
                flyweight.display(), x, y,  flyweight.hashCode());
    }


}
