package com.example.gofp.head_first.sol.structural.facade.classes;

import com.example.gofp.binding.Systems;

public class HomeTheaterFacade {
    Amplifier amp;
    Tuner tuner;
    DVDPlayer dvd;
    CDPlayer cd;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amp, Tuner tuner, DVDPlayer dvd, CDPlayer cd,
                             Projector projector, TheaterLights lights, Screen screen,
                             PopcornPopper popper) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    public void watchMovie(String movie){
        Systems.out.println("Get ready to watch a movie...");

        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.setDVD(dvd);
        projector.wideScreenMode();
        amp.on();
        amp.setDVD(dvd);
        amp.setSurround();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie(){
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
