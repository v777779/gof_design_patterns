package com.example.gofp.head_first.sol.behavioral.command.classes.action;

import android.text.TextUtils;

import com.example.gofp.binding.Systems;

public class GarageDoorImpl implements GarageDoor {
    private String name;

    public GarageDoorImpl(String name) {
        if (TextUtils.isEmpty(name)) {
            name = "Garage Door";
        }
        this.name = name;
    }

    @Override
    public void up() {
        Systems.out.println(name + " open");
    }

    @Override
    public void down() {
        Systems.out.println(name + " close");
    }

    @Override
    public void stop() {
        Systems.out.println(name + " stop");
    }

    @Override
    public void lightOn() {
        Systems.out.println(name + " light on");
    }

    @Override
    public void lightOff() {
        Systems.out.println(name + " light off");
    }


}
