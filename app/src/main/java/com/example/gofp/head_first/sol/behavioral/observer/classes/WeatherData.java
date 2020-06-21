package com.example.gofp.head_first.sol.behavioral.observer.classes;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<WObserver> observers;
    private float temp;
    private float humidity;
    private float pressure;


    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(WObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(WObserver observer) {
        int index = observers.indexOf(observer);
        if (index < 0) {
            return;
        }
        observers.remove(index);
    }

    @Override
    public void notifyObservers() {
        for (WObserver observer : observers) {
            if(observer == null){
                continue;
            }
            observer.update(temp,humidity,pressure);
        }
    }

    public void setMeasurements(float temp,float humidity,float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}
