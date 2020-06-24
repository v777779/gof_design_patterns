package com.example.gofp.head_first.pre.structural.flyweight.classes;

import com.example.gofp.binding.Systems;

import java.util.Locale;

/**
 *  The parameters x,y,age are fields of the Tree class
 *  In Flyweight pattern context these parameters are considered as extrinsic ones
 *  So for the solutions they extracted from the class fields and moved to the arguments
 *  of display method
 */
public class TreeImpl implements Tree {
    private int x;
    private int y;
    private int age;

    public TreeImpl(int x, int y, int age) {
        this.x = x;
        this.y = y;
        this.age = age;
    }

    @Override
    public void display() {
        String s = String.format(Locale.ENGLISH, "Tree x: %02d, y: %02d, age: %02d @%x",
                x, y, age, hashCode());
        Systems.out.println(s);
    }

}
