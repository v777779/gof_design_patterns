package com.example.gofp.head_first.sol.structural.facade.classes;

import com.example.gofp.binding.Systems;

import java.util.Locale;

public class TheaterLights {
    public void on(){
        Systems.out.println("Theater Lights on");
    }
    public void off(){
        Systems.out.println("Theater Lights off");
    }

    public void dim(int value){
        Systems.out.println(String.format(Locale.ENGLISH,
                "Theater Lights dimmed to %d",value));
    }

}
