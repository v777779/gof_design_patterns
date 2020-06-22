package com.example.gofp.head_first.sol.structural.flyweight.classes;

import com.example.gofp.binding.Systems;

import java.util.Locale;

public class TreeImpl implements Tree {
    private String name;
    private int x;
    private int y;
    private int age;

    public TreeImpl(String name, int x, int y, int age) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.age = age;
    }

    public void display() {
        String s = String.format(Locale.ENGLISH, "%s, x: %02d, y: %02d, age: %02d @%x",
                name, x, y, age, hashCode());
        Systems.out.println(s);
    }


}
