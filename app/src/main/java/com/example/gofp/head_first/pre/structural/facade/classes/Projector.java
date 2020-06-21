package com.example.gofp.head_first.pre.structural.facade.classes;

import com.example.gofp.binding.Systems;

public class Projector {
    private DVDPlayer dvdPlayer;


    public void on() {
        Systems.out.println("Projector on");
    }

    public void off() {
        Systems.out.println("Projector off");
    }

    public void tvMode() {
        Systems.out.println("Projector set TV mode");
    }

    public void wideScreenMode() {
        Systems.out.println("Projector set Wide Screen mode");
    }

    public void setDVD(DVDPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }
}
