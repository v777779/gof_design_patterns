package com.example.gofp.head_first.pre.creational.prototype;

import com.example.gofp.binding.BasePattern;
import com.example.gofp.head_first.pre.creational.prototype.classes.DynamicPlayerMonster;
import com.example.gofp.head_first.pre.creational.prototype.classes.Monster;
import com.example.gofp.head_first.pre.creational.prototype.classes.WellKnownMonster;

import java.util.ArrayList;
import java.util.List;

public class Prototype extends BasePattern {
    @Override
    public void main() {
        List<Monster> monsters = new ArrayList<>();

        monsters.add(new WellKnownMonster("Mickey"));
        monsters.add(new DynamicPlayerMonster("Bob", "Dillinger"));
        monsters.add(new WellKnownMonster("Lukey"));
        monsters.add(new DynamicPlayerMonster("Pit", "Alba"));
        monsters.add(new DynamicPlayerMonster("Clark", "Semicont"));

        for (Monster monster : monsters) {
            monster.display();
        }


    }
}
