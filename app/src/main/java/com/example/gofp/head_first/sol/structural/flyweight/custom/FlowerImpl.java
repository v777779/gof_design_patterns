package com.example.gofp.head_first.sol.structural.flyweight.custom;

import java.util.Locale;

public class FlowerImpl implements Flower {
    private Flower flyweight;
    private int x;
    private int y;

    public FlowerImpl(Flower flyweight, int x, int y) {
        this.flyweight = flyweight;
        this.x = x;
        this.y = y;
    }

    @Override
    public void display() {
        flyweight.display(x, y);  // x, y extrinsic parameters
    }

    @Override
    public void display(int x, int y) {
        flyweight.display(x, y);
    }


}
