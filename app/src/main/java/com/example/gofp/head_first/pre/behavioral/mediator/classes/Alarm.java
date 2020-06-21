package com.example.gofp.head_first.pre.behavioral.mediator.classes;

import com.example.gofp.binding.Systems;

public class Alarm implements Event {
    private Event calendar;
    private Event coffeePot;
    private Event sprinkler;

    private String name;

    public Alarm() {
        this.name = getClass().getSimpleName();
    }

    @Override
    public void check() {
        Systems.out.println(name + ": checked");
    }

    @Override
    public void onEvent() {
        checkCalendar();
        checkSprinkler();
        startCoffee();
    }

    @Override
    public void execute(String command) {
        Systems.out.println(name + ": " + command);
    }

// methods

    private void checkCalendar() {
        calendar.check();
    }

    private void checkSprinkler() {
        sprinkler.check();
    }

    private void startCoffee() {
        coffeePot.execute("start coffee brewing");
    }


    public void setCalendar(Event calendar) {
        this.calendar = calendar;
    }

    public void setCoffeePot(Event coffeePot) {
        this.coffeePot = coffeePot;
    }

    public void setSprinkler(Event sprinkler) {
        this.sprinkler = sprinkler;
    }

}
