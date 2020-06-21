package com.example.gofp.head_first.sol.structural.fly_weight;

import com.example.gofp.binding.BasePattern;
import com.example.gofp.binding.Systems;
import com.example.gofp.head_first.sol.structural.fly_weight.classes.Tree;
import com.example.gofp.head_first.sol.structural.fly_weight.classes.TreeManager;

import java.util.ArrayList;
import java.util.List;

public class FlyWeight extends BasePattern {
    @Override
    public void main() {
        TreeManager manager = new TreeManager();

        List<Tree> trees  = new ArrayList<>();
        trees.add(manager.create("Apple "));
        trees.add(manager.create("Apple "));
        trees.add(manager.create("Apple "));
        trees.add(manager.create("Cherry"));
        trees.add(manager.create("Cherry"));
        trees.add(manager.create("Oak     "));
        trees.add(manager.create("Birch   "));
        trees.add(manager.create("Linden"));

        Systems.out.println("Garden:");
        manager.displayTrees(trees);

    }
}
