package com.example.gofp.head_first.pre.structural.facade.classes;

import com.example.gofp.binding.Systems;

public class DVDPlayer {
    private Amplifier amplifier;

    public DVDPlayer(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void on() {
        Systems.out.println("DVD Player on");
    }

    public void off() {
        Systems.out.println("DVD Player off");
    }

    public void eject() {
        Systems.out.println("DVD Player eject DVD");
    }

    public void pause() {
        Systems.out.println("DVD Player pause");
    }

    public void play(String movie) {
        Systems.out.println("DVD Player play: " + movie);
    }

    public void setSurround() {
        Systems.out.println("DVD Player Surround Audio mode");
    }

    public void setStereo() {
        Systems.out.println("DVD Player set Stereo Audio mode");
    }

    public void stop() {
        Systems.out.println("DVD Player stop");
    }
}
