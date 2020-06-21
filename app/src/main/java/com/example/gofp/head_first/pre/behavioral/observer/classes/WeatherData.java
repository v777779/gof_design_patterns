package com.example.gofp.head_first.pre.behavioral.observer.classes;

import java.util.Random;

public class WeatherData {
    private static final Random rand = new Random();

    private CurrentDisplay currentDisplay;
    private StatisticsDisplay statisticsDisplay;
    private ForecastDisplay forecastDisplay;

    public WeatherData() {
        this.currentDisplay = new CurrentDisplay();
        this.statisticsDisplay = new StatisticsDisplay();
        this.forecastDisplay = new ForecastDisplay();
    }

    public void measurementsChanged() {
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        currentDisplay.update(temp, humidity, pressure);
        statisticsDisplay.update(temp, humidity, pressure);
        forecastDisplay.update(temp, humidity, pressure);

    }

    private float getTemperature() {
        return rand.nextFloat() * 40 + 5;
    }

    private float getHumidity() {
        return rand.nextFloat() * 50 + 50;
    }

    private float getPressure() {
        return rand.nextFloat() * 50 + 720;
    }



}
