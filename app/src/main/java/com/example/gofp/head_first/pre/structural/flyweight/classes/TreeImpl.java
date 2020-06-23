package com.example.gofp.head_first.pre.structural.flyweight.classes;

import com.example.gofp.binding.Systems;

import java.util.Locale;

public class TreeImpl  implements Tree{
    private int x;
    private int y;
    private int age;

    public TreeImpl( int x, int y, int age) {
        this.x = x;
        this.y = y;
        this.age = age;
    }

    @Override
    public String display() {
        return  String.format(Locale.ENGLISH, "Tree x: %02d, y: %02d, age: %02d @%x",
                x, y, age, hashCode());
    }

}
