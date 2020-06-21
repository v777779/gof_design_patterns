package com.example.gofp.head_first.sol.behavioral.command.classes.action;

import com.example.gofp.binding.Systems;

public class CeilingFanImpl implements CeilingFan {
    private String name;

    public CeilingFanImpl(String name) {
        this.name = name;
    }

    @Override
    public void on() {
        Systems.out.println(name + " ceiling fan on ");
    }

    @Override
    public void off() {
        Systems.out.println(name + " ceiling fan off");
    }
}
