package com.example.gofp.head_first.sol.behavioral.observer.classes;

import com.example.gofp.binding.Systems;

import java.util.Locale;

public class CurrentConditionDisplay implements WObserver, DisplayElement {
    private Subject weatherData;

    private float temp;
    private float humidity;
    private float pressure;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        String name = "Current Conditions:";
        Systems.out.println(name);
        String s = String.format(Locale.ENGLISH, " - %.1f C degrees, " +
                "humidity: %.1f %% pressure: %.1f mm", temp, humidity, pressure);
        Systems.out.println(s);
    }

    /**
     * Used for notifications by Subject
     */
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    }
}
