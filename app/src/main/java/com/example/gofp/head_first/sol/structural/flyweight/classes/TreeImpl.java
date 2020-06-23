package com.example.gofp.head_first.sol.structural.flyweight.classes;

import com.example.gofp.binding.Systems;

import java.util.Locale;

public class TreeImpl implements Tree {

    public TreeImpl() {
    }

    public void display(int x, int y, int age) {
        String s = String.format(Locale.ENGLISH, "Tree x: %02d, y: %02d, age: %02d @%x",
                x, y, age, hashCode());
        Systems.out.println(s);
    }


}
