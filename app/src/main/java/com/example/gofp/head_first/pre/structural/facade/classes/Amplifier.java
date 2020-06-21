package com.example.gofp.head_first.pre.structural.facade.classes;

import com.example.gofp.binding.Systems;

import java.util.Locale;

public class Amplifier {
    private Tuner tuner;
    private DVDPlayer dvdPlayer;
    private CDPlayer cdPlayer;


    public void on() {
        Systems.out.println("Amplifier on");
    }

    public void off() {
        Systems.out.println("Amplifier off");
    }

    public void setSurround() {
        Systems.out.println("Amplifier Surround Audio mode");
    }

    public void setStereo() {
        Systems.out.println("Amplifier set Stereo Audio mode");
    }

    public void setVolume(int volume) {
        Systems.out.println(String.format(Locale.ENGLISH,
                "Amplifier set volume to %d", volume));
    }

    public void stop() {
        Systems.out.println("Amplifier stop");
    }


    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }

    public void setDVD(DVDPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }

    public void setCD(CDPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
    }
}
