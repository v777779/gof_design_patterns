package com.example.gofp.head_first.pre.behavioral.observer;

import com.example.gofp.binding.BasePattern;
import com.example.gofp.binding.Systems;
import com.example.gofp.head_first.pre.behavioral.observer.classes.WeatherData;

public class Observer extends BasePattern {

    @Override
    public void main() {
        WeatherData weatherData = new WeatherData();
        weatherData.measurementsChanged();
        Systems.out.println();
        weatherData.measurementsChanged();
        Systems.out.println();
        weatherData.measurementsChanged();
        Systems.out.println();

    }
}
