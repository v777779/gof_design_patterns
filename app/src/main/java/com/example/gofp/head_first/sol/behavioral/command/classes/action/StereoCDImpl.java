package com.example.gofp.head_first.sol.behavioral.command.classes.action;

import com.example.gofp.binding.Systems;

public class StereoCDImpl implements StereoCD {
    private String name;

    public StereoCDImpl(String name) {
        this.name = name;
    }

    @Override
    public void on() {
        Systems.out.println(name + " stereo CD on");
    }

    @Override
    public void off() {
        Systems.out.println(name + " stereo CD off");
    }

    @Override
    public void setCD() {
        Systems.out.println(name + " stereo CD changed");
    }

    @Override
    public void setVolume(int i) {
        Systems.out.println(name + " stereo CD volume set to " + i);
    }
}
