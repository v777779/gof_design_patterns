package com.example.gofp.head_first.sol.structural.facade;

import com.example.gofp.binding.BasePattern;
import com.example.gofp.binding.Systems;
import com.example.gofp.head_first.sol.structural.facade.classes.Amplifier;
import com.example.gofp.head_first.sol.structural.facade.classes.CDPlayer;
import com.example.gofp.head_first.sol.structural.facade.classes.DVDPlayer;
import com.example.gofp.head_first.sol.structural.facade.classes.HomeTheaterFacade;
import com.example.gofp.head_first.sol.structural.facade.classes.PopcornPopper;
import com.example.gofp.head_first.sol.structural.facade.classes.Projector;
import com.example.gofp.head_first.sol.structural.facade.classes.Screen;
import com.example.gofp.head_first.sol.structural.facade.classes.TheaterLights;
import com.example.gofp.head_first.sol.structural.facade.classes.Tuner;

public class Facade extends BasePattern {
    @Override
    public void main() {
        PopcornPopper popper = new PopcornPopper();
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        Projector projector = new Projector();
        Amplifier amp = new Amplifier();
        DVDPlayer dvd = new DVDPlayer(amp);
        CDPlayer cd = new CDPlayer(amp);
        Tuner tuner = new Tuner(amp);

        HomeTheaterFacade facade= new HomeTheaterFacade(amp,tuner,dvd,cd,
                projector,lights,screen,popper);

        facade.watchMovie("Jack and thousands of worlds");
        Systems.out.println();
        facade.endMovie();
    }
}
