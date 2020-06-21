package com.example.gofp.head_first.sol.behavioral.template_method.classes;

import com.example.gofp.binding.Systems;

public abstract class CaffeineBeverage {
    public final void prepareRecipe() { // cannot be override
        Systems.out.println("Prepare " + getClass().getSimpleName() + "...");
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()) {   // via hook default true
            addCondiments();
        }
    }

    public void boilWater() {
        Systems.out.println("Boiling water");
    }

    public void pourInCup() {
        Systems.out.println("Pouring into cup");
    }

    public abstract void brew();

    public abstract void addCondiments();

    public boolean customerWantsCondiments() {
        return true;
    }

}
