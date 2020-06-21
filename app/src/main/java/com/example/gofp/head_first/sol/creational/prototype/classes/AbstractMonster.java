package com.example.gofp.head_first.sol.creational.prototype.classes;

import androidx.annotation.NonNull;

import com.example.gofp.binding.Systems;

import java.util.Locale;

public abstract class AbstractMonster implements Monster {
   protected  String name;
   protected String type;

    public AbstractMonster(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NonNull
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public void display() {
        String s = String.format(Locale.ENGLISH, "Monster: %s type: %s hash: @%x",
                name, type, hashCode());
        Systems.out.println(s);
    }

}
