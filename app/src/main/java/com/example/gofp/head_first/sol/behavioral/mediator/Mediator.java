package com.example.gofp.head_first.sol.behavioral.mediator;

import com.example.gofp.binding.BasePattern;
import com.example.gofp.binding.Systems;
import com.example.gofp.head_first.sol.behavioral.mediator.classes.AbstractMediator;
import com.example.gofp.head_first.sol.behavioral.mediator.classes.Alarm;
import com.example.gofp.head_first.sol.behavioral.mediator.classes.Calendar;
import com.example.gofp.head_first.sol.behavioral.mediator.classes.CoffeePot;
import com.example.gofp.head_first.sol.behavioral.mediator.classes.Event;
import com.example.gofp.head_first.sol.behavioral.mediator.classes.MediatorImpl;
import com.example.gofp.head_first.sol.behavioral.mediator.classes.Sprinkler;


public class Mediator extends BasePattern {
    @Override
    public void main() {
        AbstractMediator mediator = new MediatorImpl();
        Event alarm = new Alarm(mediator);
        Event calendar = new Calendar(mediator);
        Event coffee = new CoffeePot(mediator);
        Event sprinkler = new Sprinkler(mediator);

        mediator.register(alarm);
        mediator.register(calendar);
        mediator.register(coffee);
        mediator.register(sprinkler);

        Systems.out.println("Alarm event:");
        alarm.onEvent();

        Systems.out.println();
        Systems.out.println("Calendar event:");
        calendar.onEvent();

        Systems.out.println();
        Systems.out.println("CoffeePot event:");
        coffee.onEvent();

        Systems.out.println();
        Systems.out.println("Sprinkler event:");
        sprinkler.onEvent();

    }
}
