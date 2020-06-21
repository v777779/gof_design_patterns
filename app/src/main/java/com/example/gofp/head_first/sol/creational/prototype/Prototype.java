package com.example.gofp.head_first.sol.creational.prototype;

import com.example.gofp.binding.BasePattern;
import com.example.gofp.head_first.sol.creational.prototype.classes.Monster;
import com.example.gofp.head_first.sol.creational.prototype.classes.MonsterMaker;
import com.example.gofp.head_first.sol.creational.prototype.classes.MonsterRegistry;

import java.util.ArrayList;
import java.util.List;

public class Prototype extends BasePattern {
    @Override
    public void main() {
        MonsterRegistry registry = new MonsterRegistry();
        MonsterMaker monsterMaker = new MonsterMaker(registry);

        List<Monster> monsters = new ArrayList<>();
        monsters.add(monsterMaker.getRandomMonster());
        monsters.add(monsterMaker.getRandomMonster());
        monsters.add(monsterMaker.getRandomMonster());
        monsters.add(monsterMaker.getRandomMonster());
        monsters.add(monsterMaker.getRandomMonster());

        for (Monster monster : monsters) {
            monster.display();
        }
    }
}
