package com.example.gofp.plural.pre.structural.bridge;


import com.example.gofp.binding.BasePattern;
import com.example.gofp.binding.Systems;
import com.example.gofp.plural.pre.structural.bridge.classes.CircleBlue;
import com.example.gofp.plural.pre.structural.bridge.classes.CircleGreen;
import com.example.gofp.plural.pre.structural.bridge.classes.CircleRed;
import com.example.gofp.plural.pre.structural.bridge.classes.Shape;
import com.example.gofp.plural.pre.structural.bridge.classes.SquareBlue;
import com.example.gofp.plural.pre.structural.bridge.classes.SquareGreen;
import com.example.gofp.plural.pre.structural.bridge.classes.SquareRed;

public class Bridge extends BasePattern {

    public void main() {

        Shape square = new SquareBlue();
        Shape squareGreen = new SquareGreen();
        Shape squareRed = new SquareRed();

        Shape circle = new CircleBlue();
        Shape circleGreen = new CircleGreen();
        Shape circleRed =  new CircleRed();

        square.applyColor();
        squareGreen.applyColor();
        squareRed.applyColor();

        Systems.out.println();

        circle.applyColor();
        circleGreen.applyColor();
        circleRed.applyColor();

    }
}
