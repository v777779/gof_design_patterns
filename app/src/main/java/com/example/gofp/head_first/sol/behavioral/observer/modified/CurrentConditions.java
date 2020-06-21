package com.example.gofp.head_first.sol.behavioral.observer.modified;

import com.example.gofp.binding.Systems;
import com.example.gofp.head_first.sol.behavioral.observer.classes.DisplayElement;

import java.util.Locale;
import java.util.Observable;
import java.util.Observer;

import static com.example.gofp.head_first.sol.behavioral.observer.modified.Weather.HUMIDITY_INDEX;
import static com.example.gofp.head_first.sol.behavioral.observer.modified.Weather.PRESSURE_INDEX;
import static com.example.gofp.head_first.sol.behavioral.observer.modified.Weather.TEMP_INDEX;

public class CurrentConditions implements Observer, DisplayElement {


    private float temp;
    private float humidity;
    private float pressure;

    public CurrentConditions(Observable weather) {
        weather.addObserver(this);
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
     * Used for notifications by Observable
     */
    @Override
    public void update(Observable weather, Object arg) {
        float[] array = (float[])arg;
        this.temp = array[TEMP_INDEX];
        this.humidity = array[HUMIDITY_INDEX];
        this.pressure = array[PRESSURE_INDEX];
    }
}
