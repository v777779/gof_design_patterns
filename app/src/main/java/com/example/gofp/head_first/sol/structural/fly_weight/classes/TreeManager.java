package com.example.gofp.head_first.sol.structural.fly_weight.classes;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class TreeManager {
    private final Random rand;
    private final HashMap<String, Tree> map;

    public TreeManager() {
        this.rand = new Random(System.currentTimeMillis());
        this.map = new HashMap<>();
    }

    public Tree create(String name) {
        Tree tree = map.get(name);
        if (tree == null) {
            tree = new TreeImpl(name, rand.nextInt(75), rand.nextInt(75),
                    rand.nextInt(50));
            map.put(name, tree);
        }
        return tree;
    }

    public void displayTrees(List<Tree> trees) {
        for (Tree tree : trees) {
            tree.display();
        }
    }
}