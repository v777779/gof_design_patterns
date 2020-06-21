package com.example.gofp.head_first.pre.structural.fly_weight.classes;

import java.util.List;
import java.util.Random;

public class TreeManager {
    private final Random rand;

    public TreeManager() {
        this.rand = new Random(System.currentTimeMillis());
    }

    public Tree create(String name) {
        return new TreeImpl(name, rand.nextInt(75), rand.nextInt(75),
                rand.nextInt(50));
    }

    public void displayTrees(List<Tree> trees){
        for (Tree tree : trees) {
            tree.display();
        }
    }
}