package com.example.gofp.head_first.sol.structural.facade.classes;

import com.example.gofp.binding.Systems;

import java.util.Locale;

public class Tuner {
    private Amplifier amplifier;

    public Tuner(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void on() {
        Systems.out.println("Tuner on");
    }

    public void off() {
        Systems.out.println("Tuner off");
    }

    public void setAm() {
        Systems.out.println("Tuner set AM band");
    }

    public void setFm() {
        Systems.out.println("Tuner set FM band");
    }

    public void setFrequency(float frequency) {
        Systems.out.println(String.format(Locale.ENGLISH,
                "Tuner set frequency to %.1f", frequency));
    }

}
