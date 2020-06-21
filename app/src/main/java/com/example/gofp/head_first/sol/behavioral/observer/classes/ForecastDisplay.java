package com.example.gofp.head_first.sol.behavioral.observer.classes;

import com.example.gofp.binding.Systems;

import java.util.Locale;

public class ForecastDisplay implements WObserver, DisplayElement {
    private Subject weatherData;

    private float[] temps;
    private float[] humidities;
    private float[] pressures;
    private float temp;
    private float humidity;
    private float pressure;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);

        this.temps = Utils.create();
        this.humidities = Utils.create();
        this.pressures = Utils.create();
    }

    @Override
    public void display() {
        String name = "Forecast:";
        Systems.out.println(name);
        display(" - temperature", " C degrees", temps, temp);
        display(" - humidity", " %%", humidities, humidity);
        display(" - pressure", " mm", pressures, pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        Utils.shift(this.temps, temp);
        Utils.shift(this.humidities, humidity);
        Utils.shift(this.pressures, pressure);
    }


    private void display(String name, String suffix, float[] values, float current) {
        float average = Utils.average(values);
        String s;
        if (!Utils.isValid(average)) {
            s = String.format("%s: - ", name);
        } else {
            float value = current + (current - average) / 2;
            s = String.format(Locale.ENGLISH, "%s: %s %s", name, Utils.format(value),
                    suffix);
        }
        Systems.out.println(s);
    }
}
