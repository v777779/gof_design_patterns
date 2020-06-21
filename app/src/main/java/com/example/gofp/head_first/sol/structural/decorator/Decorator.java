package com.example.gofp.head_first.sol.structural.decorator;


import com.example.gofp.binding.BasePattern;
import com.example.gofp.binding.Systems;
import com.example.gofp.head_first.sol.structural.decorator.classes.Beverage;
import com.example.gofp.head_first.sol.structural.decorator.classes.DarkRoast;
import com.example.gofp.head_first.sol.structural.decorator.classes.Espresso;
import com.example.gofp.head_first.sol.structural.decorator.classes.HouseBlend;
import com.example.gofp.head_first.sol.structural.decorator.classes.Milk;
import com.example.gofp.head_first.sol.structural.decorator.classes.Mocha;
import com.example.gofp.head_first.sol.structural.decorator.classes.Whip;

public class Decorator extends BasePattern {
    @Override
    public void main() {

        Systems.out.println("Head First:");
        Beverage espresso = new Espresso();
        Systems.out.println(espresso);
        espresso = new Milk(espresso);
        espresso = new Mocha(espresso);
        espresso = new Whip(espresso);
        espresso = new Whip(espresso);
        Systems.out.println(espresso);

        Systems.out.println();

        Beverage darkRoast = new DarkRoast();
        Systems.out.println(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        Systems.out.println(darkRoast);

        Systems.out.println();

        Beverage houseBlend = new HouseBlend();
        Systems.out.println(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        Systems.out.println(houseBlend);

    }
}
