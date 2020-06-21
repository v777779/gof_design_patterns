package com.example.gofp.head_first.pre.creational.prototype.classes;

import com.example.gofp.binding.Systems;

import java.util.Locale;

public class DynamicPlayerMonster extends AbstractMonster {

    private String player;

    public DynamicPlayerMonster(String player, String name) {
        super(name,"dynamic");
        this.player = player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    @Override
    public void display() {
        String s = String.format(Locale.ENGLISH, "Monster: %s type: %s player: %s hash: @%x",
                name, type, player, hashCode());
        Systems.out.println(s);
    }
}
