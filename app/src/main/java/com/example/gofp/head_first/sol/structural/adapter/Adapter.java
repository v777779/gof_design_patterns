package com.example.gofp.head_first.sol.structural.adapter;

import com.example.gofp.binding.BasePattern;
import com.example.gofp.binding.Systems;
import com.example.gofp.head_first.sol.structural.adapter.classes.Duck;
import com.example.gofp.head_first.sol.structural.adapter.classes.MallardDuck;
import com.example.gofp.head_first.sol.structural.adapter.classes.Turkey;
import com.example.gofp.head_first.sol.structural.adapter.classes.TurkeyAdapter;
import com.example.gofp.head_first.sol.structural.adapter.classes.WildTurkey;

public class Adapter extends BasePattern {
    @Override
    public void main() {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        Systems.out.println(duck.getClass().getSimpleName());
        duck.quack();
        duck.fly();
        Systems.out.println(turkey.getClass().getSimpleName());
        turkey.gobble();
        turkey.fly();

        Systems.out.println();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        Systems.out.println(turkeyAdapter.getClass().getSimpleName());
        turkeyAdapter.quack();
        turkeyAdapter.fly();

    }
}
