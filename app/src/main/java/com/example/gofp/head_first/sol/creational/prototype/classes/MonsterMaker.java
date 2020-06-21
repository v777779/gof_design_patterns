package com.example.gofp.head_first.sol.creational.prototype.classes;

import java.util.Random;

public class MonsterMaker {
    private static final String TAG = "MonsterMaker";
    private static final String[] NAMES = {
            "Brilliant", "Red", "Speedy", "Flaky", "Fighter", "Brave"
    };
    private static final String[] PLAYERS = {
            "Bob", "Jimmy", "Stan", "Garry", "Kent", "Timmy"
    };
    private static final String[] TYPES = {
            "well", "dynamic"
    };
    private MonsterRegistry registry;
    private Random random;


    public MonsterMaker(MonsterRegistry registry) {
        this.registry = registry;
        this.random = new Random(System.currentTimeMillis());
    }

    private String getRandom(String[] array) {
        return array[random.nextInt(array.length)];
    }

    public Monster getRandomMonster() {
        String name = getRandom(NAMES);
        String type = getRandom(TYPES);
        String player = getRandom(PLAYERS);

        AbstractMonster monster = (AbstractMonster)registry.getMonster(type);
        if(monster == null){
            return null;
        }
        monster.setName(name);
        if(type.equals(TYPES[1])) {
            ((DynamicPlayerMonster)monster).setPlayer(player);
        }
        return monster;
    }
}
