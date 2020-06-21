package com.example.gofp.head_first.sol.structural.bridge.classes;

public abstract class RemoteControl {
    protected TVRemote remote;
    protected int channel;

    public RemoteControl(TVRemote remote) {
        this.remote = remote;
        this.channel = 0;
    }

    public abstract void on();
    public abstract void off();
    public abstract void nextChannel();
    public abstract void previousChannel();

}
