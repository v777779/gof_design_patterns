package com.example.gofp.head_first.sol.creational.prototype.classes;

import com.example.gofp.binding.Systems;

import java.util.HashMap;
import java.util.Map;

public class MonsterRegistry {
    private static final String TAG = "MonsterRegistry";

    private Map<String, Monster> map;

    public MonsterRegistry() {
        this.map = new HashMap<>();
        loadMonsters();
    }

    private void loadMonsters() {
        map.put("well", new WellKnownMonster("Mickey"));
        map.put("dynamic", new DynamicPlayerMonster("Bob", "Pit"));
    }

    public Monster getMonster(String type) {
        try {
            Monster correctMonster = map.get(type);
            if (correctMonster == null) {
                return null;
            }
            return (Monster) correctMonster.clone();
        } catch (Exception e) {
            Systems.out.println(TAG + " " + e.getMessage());
        }
        return null;
    }
}
