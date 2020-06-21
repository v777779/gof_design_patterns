package com.example.gofp.head_first.sol.behavioral.observer.modified;

import com.example.gofp.head_first.sol.behavioral.observer.classes.Utils;

import java.util.Observable;
import java.util.Observer;

public class Weather extends Observable {
    public static final int TEMP_INDEX = 0;
    public static final int HUMIDITY_INDEX = 1;
    public static final int PRESSURE_INDEX = 2;

    public Weather() {
    }

    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
    }

    @Override
    public synchronized void deleteObserver(Observer o) {
        super.deleteObserver(o);
    }

    @Override
    public void notifyObservers(Object arg) {
        setChanged();                           // trigger to acquire arg
        super.notifyObservers(arg);
    }

    public void setMeasurements() {
        float[] array = new float[]{
                Utils.getTemperature(), Utils.getHumidity(), Utils.getPressure()
        };
        notifyObservers(array);
    }
}
