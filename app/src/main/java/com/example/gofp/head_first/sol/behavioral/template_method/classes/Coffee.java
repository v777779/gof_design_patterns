package com.example.gofp.head_first.sol.behavioral.template_method.classes;

import com.example.gofp.binding.Systems;

public class Coffee extends CaffeineBeverage {

    @Override
    public void brew() {
        Systems.out.println("Dripping coffee through filter");
    }

    @Override
    public void addCondiments() {
        Systems.out.println("Adding Sugar and Milk");
    }


}
