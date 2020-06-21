package com.example.gofp.head_first.sol.behavioral.template_method.classes;

import com.example.gofp.binding.Systems;

public class Tea extends CaffeineBeverage {
    private boolean isCondiments;

    public Tea() {
        isCondiments = true;
    }

    public Tea(boolean isCondiments) {
        this.isCondiments = isCondiments;
    }

    @Override
    public void brew() {
        Systems.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments() {
        Systems.out.println("Adding Lemon");
    }

    @Override
    public boolean customerWantsCondiments() {
        return isCondiments;
    }
}
