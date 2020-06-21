package com.example.gofp.head_first.pre.behavioral.observer.classes;

import com.example.gofp.binding.Systems;

public class ForecastDisplay implements Display {

    private float[] temps;
    private float[] hmds;
    private float[] press;

    public ForecastDisplay() {
        this.temps = Utils.create();
        this.hmds = Utils.create();
        this.press = Utils.create();
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        Systems.out.println("Forecast Conditions:");
        Utils.shift(temps, temp);
        Utils.shift(hmds, humidity);
        Utils.shift(press, pressure);

        float averageTemp = Utils.average(temps);              // average
        float averageHumidity = Utils.average(hmds);
        float averagePressure = Utils.average(press);

        float forecastTemp = (temp - averageTemp) / 2 + temp;
        float forecastHumidity = (humidity - averageHumidity) / 2 + humidity;
        float forecastPressure = (pressure - averagePressure) / 2 + pressure;

        Utils.display("Forecast Temperaturef", forecastTemp);
        Utils.display("Forecast Humidity", forecastHumidity);
        Utils.display("Forecast Pressure", forecastPressure);
    }


}
