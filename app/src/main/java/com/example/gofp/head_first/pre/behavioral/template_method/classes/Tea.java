package com.example.gofp.head_first.pre.behavioral.template_method.classes;

import com.example.gofp.binding.Systems;

public class Tea {
    public void prepareRecipe() {
        Systems.out.println("Prepare Tea...");
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    private void boilWater() {
        Systems.out.println("Boiling water");
    }

    private void steepTeaBag() {
        Systems.out.println("Steeping the tea");
    }

    private void pourInCup() {
        Systems.out.println("Pouring into cup");
    }

    private void addLemon() {
        Systems.out.println("Adding Lemon");
    }

}
