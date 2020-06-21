package com.example.gofp.head_first.pre.behavioral.mediator;

import com.example.gofp.binding.BasePattern;
import com.example.gofp.binding.Systems;
import com.example.gofp.head_first.pre.behavioral.mediator.classes.Alarm;
import com.example.gofp.head_first.pre.behavioral.mediator.classes.Calendar;
import com.example.gofp.head_first.pre.behavioral.mediator.classes.CoffeePot;
import com.example.gofp.head_first.pre.behavioral.mediator.classes.Sprinkler;

public class Mediator extends BasePattern {
    @Override
    public void main() {
        Alarm alarm = new Alarm();
        Calendar calendar = new Calendar();
        CoffeePot coffeePot = new CoffeePot();
        Sprinkler sprinkler = new Sprinkler();

        alarm.setCalendar(calendar);
        alarm.setCoffeePot(coffeePot);
        alarm.setSprinkler(sprinkler);

        coffeePot.setAlarm(alarm);
        coffeePot.setCalendar(calendar);

        sprinkler.setCalendar(calendar);

        calendar.setAlarm(alarm);
        calendar.setCoffeePot(coffeePot);
        calendar.setSprinkler(sprinkler);

        Systems.out.println("Alarm event:");
        alarm.onEvent();

        Systems.out.println();
        Systems.out.println("Calendar event:");
        calendar.onEvent();

        Systems.out.println();
        Systems.out.println("CoffeePot event:");
        coffeePot.onEvent();

        Systems.out.println();
        Systems.out.println("Sprinkler event:");
        sprinkler.onEvent();

    }
}
