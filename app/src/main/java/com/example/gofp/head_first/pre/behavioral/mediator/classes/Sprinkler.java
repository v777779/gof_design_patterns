package com.example.gofp.head_first.pre.behavioral.mediator.classes;

import com.example.gofp.binding.Systems;

public class Sprinkler implements Event {
    private Event calendar;

    private String name;

    public Sprinkler() {
        this.name = getClass().getSimpleName();
    }

    @Override
    public void check() {
        Systems.out.println(name + ": checked");
    }

    @Override
    public void onEvent() {
        checkCalendar();
        checkShower();
        checkTemp();
        checkWeather();
    }

    @Override
    public void execute(String command) {
        Systems.out.println(name + ": " + command);
    }

// methods

    private void checkCalendar() {
        calendar.check();
    }

    private void checkShower() {
        execute("check shower");
    }

    private void checkTemp() {
        execute("check temperature");
    }
    private void checkWeather() {
        execute("check weather");
    }

    public void setCalendar(Event calendar) {
        this.calendar = calendar;
    }
}
