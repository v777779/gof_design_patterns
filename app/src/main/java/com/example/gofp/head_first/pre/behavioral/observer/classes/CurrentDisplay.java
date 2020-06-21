package com.example.gofp.head_first.pre.behavioral.observer.classes;

import com.example.gofp.binding.Systems;

public class CurrentDisplay implements Display {
    @Override
    public void update(float temp, float humidity, float pressure) {
        Systems.out.println("Current Conditions:");
        Utils.display("Temperature",temp);
        Utils.display("Humidity",humidity);
        Utils.display("Pressure",pressure);
    }


}
