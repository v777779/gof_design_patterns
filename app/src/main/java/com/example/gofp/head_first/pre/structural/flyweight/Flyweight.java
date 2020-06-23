package com.example.gofp.head_first.pre.structural.flyweight;

import com.example.gofp.binding.BasePattern;
import com.example.gofp.binding.Systems;
import com.example.gofp.head_first.pre.structural.flyweight.classes.Tree;
import com.example.gofp.head_first.pre.structural.flyweight.classes.TreeManager;

import java.util.ArrayList;
import java.util.List;

public class Flyweight extends BasePattern {
    @Override
    public void main()   {
        TreeManager manager = new TreeManager();

        Systems.out.println("Garden:");
        manager.displayTrees();

    }
}
