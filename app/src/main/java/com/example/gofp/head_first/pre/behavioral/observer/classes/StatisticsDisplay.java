package com.example.gofp.head_first.pre.behavioral.observer.classes;

import com.example.gofp.binding.Systems;

public class StatisticsDisplay implements Display {

    private float[] temps;
    private float[] hmds;
    private float[] press;

    public StatisticsDisplay() {
        this.temps = Utils.create();
        this.hmds = Utils.create();
        this.press = Utils.create();
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        Systems.out.println("Statistics Conditions:");
        Utils.shift(temps,temp);
        Utils.shift(hmds,humidity);
        Utils.shift(press,pressure);

        float averageTemp = Utils.average(temps);              // average
        float averageHumidity = Utils.average(hmds);
        float averagePressure = Utils.average(press);

        Utils.display("Average Temperature", averageTemp);
        Utils.display("Average Humidity", averageHumidity);
        Utils.display("Average Pressure", averagePressure);
    }



}
