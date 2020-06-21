package com.example.gofp.head_first.pre.structural.facade.classes;

import com.example.gofp.binding.Systems;

public class CDPlayer {
    private Amplifier amplifier;

    public CDPlayer(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void on(){
        Systems.out.println("CD Player on");
    }
    public void off(){
        Systems.out.println("CD Player off");
    }

    public void eject(){
        Systems.out.println("CD Player eject CD");
    }
    public void pause(){
        Systems.out.println("CD Player pause");
    }
    public void play(){
        Systems.out.println("CD Player play");
    }

    public void stop(){
        Systems.out.println("CD Player stop");
    }
}
