package com.example.gofp.head_first.pre.behavioral.template_method.classes;

import com.example.gofp.binding.Systems;

public class Coffee {
    public void prepareRecipe() {
        Systems.out.println("Prepare Coffee...");
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }


    private void boilWater() {
        Systems.out.println("Boiling water");
    }

    private void brewCoffeeGrinds() {
        Systems.out.println("Dripping coffee through filter");
    }

    private void pourInCup() {
        Systems.out.println("Pouring into cup");
    }


    private void addSugarAndMilk() {
        Systems.out.println("Adding Sugar and Milk");
    }


}
