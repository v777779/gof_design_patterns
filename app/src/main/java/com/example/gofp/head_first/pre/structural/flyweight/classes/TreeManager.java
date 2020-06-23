package com.example.gofp.head_first.pre.structural.flyweight.classes;

import com.example.gofp.binding.Systems;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TreeManager {
    private static final int MAX_TREES = 10;
    private final Random rand;
    private List<Tree> trees;

    public TreeManager() {
        this.rand = new Random(System.currentTimeMillis());
        this.trees = new ArrayList<>();

        initialize();
    }

    public void initialize() {
        for (int i = 0; i < MAX_TREES; i++) {
            Tree tree = new TreeImpl(rand.nextInt(75), rand.nextInt(75),
                    rand.nextInt(50));
            trees.add(tree);
        }
    }

    public void displayTrees(){
        for (Tree tree : trees) {
            Systems.out.println(tree.display());
        }
    }
}