package com.example.gofp.head_first.pre.behavioral.mediator.classes;

import com.example.gofp.binding.Systems;

public class Calendar implements Event {
    private Event alarm;
    private Event coffeePot;
    private Event sprinkler;
    private Event calendar;

    private String name;

    public Calendar() {
        this.name = getClass().getSimpleName();
    }

    @Override
    public void check() {
        Systems.out.println(name + ": checked");
    }

    @Override
    public void onEvent() {
        checkDayOfWeek();
        doSprinkler();
        doCoffee();
        doAlarm();
    }

    @Override
    public void execute(String command) {
        Systems.out.println(name + ": " + command);
    }

// methods

    private void checkDayOfWeek() {
        execute("check day of week");
    }

    private void doSprinkler() {
        sprinkler.execute("do irrigation");
    }
    private void doCoffee() {
        coffeePot.execute("do coffee brewing");
    }
    private void doAlarm() {
        alarm.execute("do alarm set");
    }



    public void setAlarm(Event alarm) {
        this.alarm = alarm;
    }

    public void setCoffeePot(Event coffeePot) {
        this.coffeePot = coffeePot;
    }

    public void setSprinkler(Event sprinkler) {
        this.sprinkler = sprinkler;
    }

}
