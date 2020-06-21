package com.example.gofp.head_first.sol.behavioral.observer.classes;

import com.example.gofp.binding.Systems;

public class ThirdPartyDisplay implements WObserver, DisplayElement {

    private float temp;
    private float humidity;
    private float pressure;

    @Override
    public void display() {
        Systems.out.println("ThirdParty");

    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    }
}
