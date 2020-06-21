package com.example.gofp.head_first.pre.structural.decorator;

import com.example.gofp.binding.BasePattern;
import com.example.gofp.binding.Systems;
import com.example.gofp.head_first.pre.structural.decorator.classes.Beverage;
import com.example.gofp.head_first.pre.structural.decorator.classes.DarkRoast;
import com.example.gofp.head_first.pre.structural.decorator.classes.DarkRoastWithMocha;
import com.example.gofp.head_first.pre.structural.decorator.classes.Espresso;
import com.example.gofp.head_first.pre.structural.decorator.classes.EspressoWithMilk;
import com.example.gofp.head_first.pre.structural.decorator.classes.EspressoWithMilkMocha;
import com.example.gofp.head_first.pre.structural.decorator.classes.HouseBlend;
import com.example.gofp.head_first.pre.structural.decorator.classes.HouseBlendWithMilk;
import com.example.gofp.head_first.pre.structural.decorator.classes.HouseBlendWithMilkMocha;

public class Decorator extends BasePattern {
    @Override
    public void main() {
        Beverage espresso = new Espresso();
        Beverage espressoMilk = new EspressoWithMilk();
        Beverage espressoMilkMocha = new EspressoWithMilkMocha();

        Beverage houseBlend = new HouseBlend();
        Beverage houseBlendMilk = new HouseBlendWithMilk();
        Beverage houseBlendMilkMocha = new HouseBlendWithMilkMocha();

        Beverage darkRoast = new DarkRoast();
        Beverage darkRoastMocha = new DarkRoastWithMocha();

        Systems.out.println(espresso);
        Systems.out.println(espressoMilk);
        Systems.out.println(espressoMilkMocha);
        Systems.out.println();

        Systems.out.println(houseBlend);
        Systems.out.println(houseBlendMilk);
        Systems.out.println(houseBlendMilkMocha);
        Systems.out.println();

        Systems.out.println(darkRoast);
        Systems.out.println(darkRoastMocha);

    }
}
