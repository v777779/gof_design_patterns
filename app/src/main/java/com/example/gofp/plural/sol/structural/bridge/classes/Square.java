package com.example.gofp.plural.sol.structural.bridge.classes;


import com.example.gofp.binding.Systems;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        Systems.out.print(getClass().getSimpleName()+" ");
        color.applyColor();
    }
}
