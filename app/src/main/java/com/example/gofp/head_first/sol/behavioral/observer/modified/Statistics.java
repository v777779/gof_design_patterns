package com.example.gofp.head_first.sol.behavioral.observer.modified;

import com.example.gofp.binding.Systems;
import com.example.gofp.head_first.sol.behavioral.observer.classes.DisplayElement;
import com.example.gofp.head_first.sol.behavioral.observer.classes.Utils;

import java.util.Locale;
import java.util.Observable;
import java.util.Observer;

import static com.example.gofp.head_first.sol.behavioral.observer.modified.Weather.HUMIDITY_INDEX;
import static com.example.gofp.head_first.sol.behavioral.observer.modified.Weather.PRESSURE_INDEX;
import static com.example.gofp.head_first.sol.behavioral.observer.modified.Weather.TEMP_INDEX;

public class Statistics implements Observer, DisplayElement {


    private float[] temps;
    private float[] humidities;
    private float[] pressures;

    public Statistics(Observable  weather) {
        weather.addObserver(this);
        this.temps = Utils.create();
        this.humidities = Utils.create();
        this.pressures = Utils.create();
    }

    @Override
    public void display() {
        String name = "Statistics:";
        Systems.out.println(name);
        display("temperature", "C degrees", temps);
        display("humidity", "%", humidities);
        display("pressure", "mm", pressures);
    }


    private void display(String name, String suffix, float[] values) {
        String s = String.format(Locale.ENGLISH, " - avg/max/min %s: %s/%s/%s %s",
                name, Utils.format(Utils.average(values)),
                Utils.format(Utils.max(values)),
                Utils.format(Utils.min(values)), suffix);
        Systems.out.println(s);
    }

    @Override
    public void update(Observable o, Object arg) {
        float[] array = (float[])arg;
        Utils.shift(this.temps, array[TEMP_INDEX]);
        Utils.shift(this.humidities, array[HUMIDITY_INDEX]);
        Utils.shift(this.pressures, array[PRESSURE_INDEX]);
    }
}
