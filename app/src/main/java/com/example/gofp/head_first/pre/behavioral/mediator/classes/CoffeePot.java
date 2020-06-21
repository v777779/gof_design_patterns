package com.example.gofp.head_first.pre.behavioral.mediator.classes;

import com.example.gofp.binding.Systems;

public class CoffeePot implements Event {
    private Event alarm;
    private Event calendar;

    private String name;

    public CoffeePot() {
        this.name = getClass().getSimpleName();
    }

    @Override
    public void check() {
        Systems.out.println(name + ": checked");
    }

    @Override
    public void onEvent() {
        checkCalendar();
        checkAlarm();
    }

    @Override
    public void execute(String command) {
        Systems.out.println(name + ": " + command);
    }

// methods

    private void checkCalendar() {
        calendar.check();
    }

    private void checkAlarm() {
        alarm.check();
    }

    public void setAlarm(Event alarm) {
        this.alarm = alarm;
    }

    public void setCalendar(Event calendar) {
        this.calendar = calendar;
    }
}
