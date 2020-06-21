package com.example.gofp.head_first.sol.behavioral.mediator.classes;

import com.example.gofp.binding.Systems;

public class MediatorImpl extends AbstractMediator {
    private static final int INDEX_ALARM = 0;
    private static final int INDEX_CALENDAR = 1;
    private static final int INDEX_COFFEE = 2;
    private static final int INDEX_SPRINKLER = 3;

    @Override
    public void onEvent(Event event) {
        if (event == events.get(INDEX_ALARM)) {
            checkCalendar();
            checkSprinkler();
            startCoffee();
        } else if (event == events.get(INDEX_CALENDAR)) {
            checkDayOfWeek();
            doSprinkler();
            doCoffee();
            doAlarm();
        } else if (event == events.get(INDEX_COFFEE)) {
            checkCalendar();
            checkAlarm();
        } else if (event == events.get(INDEX_SPRINKLER)) {
            checkCalendar();
            checkShower();
            checkTemp();
            checkWeather();
        } else {
            Systems.out.println("Unknown event...");
        }
    }

    private void checkAlarm() {
        Event alarm = events.get(INDEX_ALARM);
        alarm.check();
    }

    private void checkSprinkler() {
        Event sprinkler = events.get(INDEX_SPRINKLER);
        sprinkler.check();
    }

    private void checkCalendar() {
        Event calendar = events.get(INDEX_CALENDAR);
        calendar.check();
    }

    private void checkDayOfWeek() {
        Event calendar = events.get(INDEX_CALENDAR);
        calendar.execute("check day of week");
    }

    private void checkShower() {
        Event sprinkler = events.get(INDEX_SPRINKLER);
        sprinkler.execute("check shower");
    }

    private void checkTemp() {
        Event sprinkler = events.get(INDEX_SPRINKLER);
        sprinkler.execute("check temperature");
    }

    private void checkWeather() {
        Event sprinkler = events.get(INDEX_SPRINKLER);
        sprinkler.execute("check weather");
    }

    private void startCoffee() {
        Event coffee = events.get(INDEX_COFFEE);
        coffee.execute("start coffee brewing");
    }

    private void doCoffee() {
        Event coffee = events.get(INDEX_COFFEE);
        coffee.execute("do coffee brewing");
    }

    private void doSprinkler() {
        Event sprinkler = events.get(INDEX_SPRINKLER);
        sprinkler.execute("do irrigation");
    }

    private void doAlarm() {
        Event alarm = events.get(INDEX_ALARM);
        alarm.execute("do alarm set");
    }


}
