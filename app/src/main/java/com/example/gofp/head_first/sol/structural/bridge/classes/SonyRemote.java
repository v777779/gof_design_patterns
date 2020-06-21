package com.example.gofp.head_first.sol.structural.bridge.classes;

import com.example.gofp.binding.Systems;

public class SonyRemote implements TVRemote {
    @Override
    public void on() {
        Systems.out.println("Sony TV Remote on");
    }

    @Override
    public void off() {
        Systems.out.println("Sony TV Remote off");
    }

    @Override
    public void tuneChannel(int channel) {
        Systems.out.println("Sony TV Remote channel set: " + channel);
    }
}
