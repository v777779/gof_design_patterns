package com.example.gofp.head_first.pre.structural.facade;

import com.example.gofp.binding.BasePattern;
import com.example.gofp.binding.Systems;
import com.example.gofp.head_first.pre.structural.facade.classes.Amplifier;
import com.example.gofp.head_first.pre.structural.facade.classes.DVDPlayer;
import com.example.gofp.head_first.pre.structural.facade.classes.PopcornPopper;
import com.example.gofp.head_first.pre.structural.facade.classes.Projector;
import com.example.gofp.head_first.pre.structural.facade.classes.Screen;
import com.example.gofp.head_first.pre.structural.facade.classes.TheaterLights;

public class Facade extends BasePattern {
    @Override
    public void main() {
        Systems.out.println("Get ready to watch a movie...");

        PopcornPopper popper = new PopcornPopper();
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        Projector projector = new Projector();
        Amplifier amp = new Amplifier();
        DVDPlayer dvd = new DVDPlayer(amp);

        popper.on();
        popper.pop();
        screen.down();
        lights.dim(10);
        projector.on();
        projector.setDVD(dvd);
        projector.wideScreenMode();
        amp.on();
        amp.setDVD(dvd);
        amp.setSurround();
        amp.setVolume(5);
        dvd.on();
        dvd.play("Jack and thousands of worlds");

        Systems.out.println();

        Systems.out.println("Shutting movie theater down...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        projector.setDVD(dvd);
        projector.wideScreenMode();
        amp.off();
        amp.setDVD(dvd);
        dvd.stop();
        dvd.off();


    }
}
