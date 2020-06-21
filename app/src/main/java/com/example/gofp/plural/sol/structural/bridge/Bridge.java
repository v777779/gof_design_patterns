package com.example.gofp.plural.sol.structural.bridge;

import com.example.gofp.binding.Systems;
import com.example.gofp.binding.BasePattern;
import com.example.gofp.plural.sol.structural.bridge.classes.Blue;
import com.example.gofp.plural.sol.structural.bridge.classes.Circle;
import com.example.gofp.plural.sol.structural.bridge.classes.Color;
import com.example.gofp.plural.sol.structural.bridge.classes.Green;
import com.example.gofp.plural.sol.structural.bridge.classes.Red;
import com.example.gofp.plural.sol.structural.bridge.classes.Shape;
import com.example.gofp.plural.sol.structural.bridge.classes.Square;

public class Bridge extends BasePattern {

    public void main() {
        Color blue = new Blue();
        Color green = new Green();
        Color red = new Red();

        Shape square = new Square(blue);
        Shape greenSquare = new Square(green);
        Shape redSquare = new Square(red);

        Shape circle = new Circle(blue);
        Shape greenCircle = new Circle(green);
        Shape redCircle = new Circle(red);

        square.applyColor();
        greenSquare.applyColor();
        redSquare.applyColor();

        Systems.out.println();

        circle.applyColor();
        greenCircle.applyColor();
        redCircle.applyColor();

    }
}
