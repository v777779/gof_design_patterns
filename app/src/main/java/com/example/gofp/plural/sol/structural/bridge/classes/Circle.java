package com.example.gofp.plural.sol.structural.bridge.classes;


import com.example.gofp.binding.Systems;

public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        Systems.out.print(getClass().getSimpleName()+" ");
        color.applyColor();
    }
}
