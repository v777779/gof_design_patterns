package com.example.gofp.head_first.sol.structural.flyweight.classes;

import com.example.gofp.binding.Systems;

import java.util.Locale;

/**
 *  The parameters x, y, age were fields of the Tree class
 *  In Flyweight pattern context these parameters are considered as extrinsic ones
 *  So for the solution parameters have been extracted from the Tree class fields and
 *  moved to the arguments of display method
 *  Now it's necessary for the one Tree instance only to represent the all trees in garden
 *  Tree instance has no intrinsic parameters, it's just a partial case
 *  Tree instance used to call display() method with context dependent extrinsic parameters
 *  x, y and age.
 *  Extrinsic or context dependent parameters no are arguments of Tree instance display() method
 */
public class TreeImpl implements Tree {

    public TreeImpl() {
    }

    public void display(int x, int y, int age) {
        String s = String.format(Locale.ENGLISH, "Tree x: %02d, y: %02d, age: %02d @%x",
                x, y, age, hashCode());
        Systems.out.println(s);
    }


}
