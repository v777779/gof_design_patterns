package com.example.gofp.head_first.sol.behavioral.observer.classes;

import com.example.gofp.binding.Systems;

import java.util.Locale;

public class StatisticsDisplay implements WObserver, DisplayElement {

    private Subject weatherData;
    private float[] temps;
    private float[] humidities;
    private float[] pressures;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
        this.temps = Utils.create();
        this.humidities = Utils.create();
        this.pressures = Utils.create();
    }

    @Override
    public void display() {
        String name = "Statistics:";
        Systems.out.println(name);
        display("temperature", "C degrees", temps);
        display("humidity", "%%", humidities);
        display("pressure", "mm", pressures);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        Utils.shift(this.temps, temp);
        Utils.shift(this.humidities, humidity);
        Utils.shift(this.pressures, pressure);
    }


    private void display(String name, String suffix, float[] values) {

        String s = String.format(Locale.ENGLISH, " - avg/max/min %s: %s/%s/%s %s",
                name, Utils.format(Utils.average(values)),
                Utils.format(Utils.max(values)),
                Utils.format(Utils.min(values)), suffix);
        Systems.out.println(s);
    }
}
