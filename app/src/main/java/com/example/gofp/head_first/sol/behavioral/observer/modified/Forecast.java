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

public class Forecast implements Observer, DisplayElement {

    private float[] temps;
    private float[] humidities;
    private float[] pressures;
    private float forecastTemp;
    private float forecastHumidity;
    private float forecastPressure;

    public Forecast(Observable weather) {
        weather.addObserver(this);
        this.temps = Utils.create();
        this.humidities = Utils.create();
        this.pressures = Utils.create();
    }

    @Override
    public void display() {
        String name = "Forecast:";
        Systems.out.println(name);
        display(" - temperature", " C degrees", forecastTemp);
        display(" - humidity", " %",  forecastHumidity);
        display(" - pressure", " mm",  forecastPressure);
    }

    private void display(String name, String suffix, float value) {
        String s;
        if (!Utils.isValid(value)) {
            s = String.format("%s: - ", name);
        } else {
            s = String.format(Locale.ENGLISH, "%s: %s %s", name, Utils.format(value),
                    suffix);
        }
        Systems.out.println(s);
    }

    private float forecast(float[] values, float current) {
        Utils.shift(values, current);
        float average = Utils.average(values);
        if (!Utils.isValid(average)) {
            return average;  // empty value
        } else {
            return current + (current - average) / 2;
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        float[] array = (float[]) arg;
        this.forecastTemp = forecast(temps,array[TEMP_INDEX]);
        this.forecastHumidity = forecast(humidities,array[HUMIDITY_INDEX]);
        this.forecastPressure = forecast(pressures,array[PRESSURE_INDEX]);


    }
}
