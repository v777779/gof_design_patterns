package com.example.gofp.head_first.sol.behavioral.command.classes.action;

import com.example.gofp.binding.Systems;

public class LightImpl implements Light {
    private String name;

    public LightImpl(String name) {
        this.name = name;
    }

    @Override
    public void on() {
        Systems.out.println(name + " light on");
    }

    @Override
    public void off() {
        System.out.println(name + " light off");
    }

}
