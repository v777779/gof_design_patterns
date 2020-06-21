package com.example.gofp.head_first.sol.structural.bridge.classes;

public class ConcreteRemote extends RemoteControl {

    public ConcreteRemote(TVRemote remote) {
        super(remote);
    }

    @Override
    public void on() {
        remote.on();
    }

    @Override
    public void off() {
        remote.off();
    }

    @Override
    public void nextChannel() {
        channel++;
        remote.tuneChannel(channel);

    }

    public void previousChannel() {
        if (channel == 0) {
            return;
        }
        channel--;
        remote.tuneChannel(channel);

    }
}
