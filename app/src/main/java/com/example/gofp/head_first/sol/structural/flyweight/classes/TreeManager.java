package com.example.gofp.head_first.sol.structural.flyweight.classes;

import java.util.Random;

public class TreeManager {
    private static final int MAX_TREES = 10;
    private static final int MAX_DIMEN = 3;
    private final Random rand;
    private int[][] treeArray;
    private Tree tree;

    public TreeManager() {
        this.rand = new Random(System.currentTimeMillis());
        this.treeArray = new int[MAX_TREES][MAX_DIMEN];
        this.tree = new TreeImpl();
        initialize();
    }

    private void initialize() {
        for (int i = 0; i < MAX_TREES; i++) {
            int x = rand.nextInt(75);
            int y = rand.nextInt(75);
            int age = rand.nextInt(50);
            treeArray[i] = new int[]{x, y, age};
        }
    }

    public void displayTrees() {
        for (int[] values : treeArray) {
         tree.display(values[0], values[1],values[2]);

        }
    }
}