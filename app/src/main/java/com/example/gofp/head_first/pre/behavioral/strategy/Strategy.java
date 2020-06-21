package com.example.gofp.head_first.pre.behavioral.strategy;

import com.example.gofp.binding.BasePattern;
import com.example.gofp.binding.Systems;
import com.example.gofp.head_first.pre.behavioral.strategy.classes.DecoyDuck;
import com.example.gofp.head_first.pre.behavioral.strategy.classes.Duck;
import com.example.gofp.head_first.pre.behavioral.strategy.classes.MallardDuck;
import com.example.gofp.head_first.pre.behavioral.strategy.classes.RubberDuck;

import java.util.ArrayList;
import java.util.List;

public class Strategy extends BasePattern {
    @Override
    public void main() {
        List<Duck> list = new ArrayList<>();
        list.add(new MallardDuck());
        list.add(new RubberDuck());
        list.add(new DecoyDuck());

        Duck duck = list.get(0);
        duck.display();
        ((MallardDuck) duck).quack();
        ((MallardDuck) duck).fly();
        ((MallardDuck) duck).swim();

        Systems.out.println();

        duck = list.get(1);
        duck.display();
        ((RubberDuck)duck).quack();
        ((RubberDuck)duck).swim();

        Systems.out.println();

        duck = list.get(2);
        duck.display();
        ((DecoyDuck)duck).quack();
    }
}
