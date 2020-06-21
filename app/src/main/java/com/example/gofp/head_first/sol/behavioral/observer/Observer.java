package com.example.gofp.head_first.sol.behavioral.observer;

import com.example.gofp.binding.BasePattern;
import com.example.gofp.binding.Systems;
import com.example.gofp.head_first.sol.behavioral.observer.classes.CurrentConditionDisplay;
import com.example.gofp.head_first.sol.behavioral.observer.classes.DisplayElement;
import com.example.gofp.head_first.sol.behavioral.observer.classes.ForecastDisplay;
import com.example.gofp.head_first.sol.behavioral.observer.classes.StatisticsDisplay;
import com.example.gofp.head_first.sol.behavioral.observer.classes.Utils;
import com.example.gofp.head_first.sol.behavioral.observer.classes.WeatherData;
import com.example.gofp.head_first.sol.behavioral.observer.modified.CurrentConditions;
import com.example.gofp.head_first.sol.behavioral.observer.modified.Forecast;
import com.example.gofp.head_first.sol.behavioral.observer.modified.Statistics;
import com.example.gofp.head_first.sol.behavioral.observer.modified.Weather;

public class Observer extends BasePattern {
    @Override
    public void main() {
        Systems.out.println("Custom Subject version:");
        Systems.out.println();
        WeatherData weatherData = new WeatherData();
        DisplayElement currentConditionsDisplay = new CurrentConditionDisplay(weatherData);
        DisplayElement statisticsDisplay = new StatisticsDisplay(weatherData);
        DisplayElement forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(Utils.getTemperature(),Utils.getHumidity(),Utils.getPressure());
        currentConditionsDisplay.display();
        weatherData.setMeasurements(Utils.getTemperature(),Utils.getHumidity(),Utils.getPressure());
        currentConditionsDisplay.display();
        statisticsDisplay.display();
        forecastDisplay.display();

        Systems.out.println();
        Systems.out.println("Observable version:");
        Systems.out.println();
        Weather weather = new Weather();
        DisplayElement currentConditions = new CurrentConditions(weather);
        DisplayElement statistics = new Statistics(weather);
        DisplayElement forecast = new Forecast(weather);
        weather.setMeasurements();
        currentConditions.display();
        weather.setMeasurements();
        currentConditions.display();
        statistics.display();
        forecast.display();

    }
}
