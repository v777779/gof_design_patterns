package com.example.gofp.head_first.sol.behavioral.mediator.classes;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractMediator {
    protected List<Event> events;

    public AbstractMediator() {
        this.events = new ArrayList<>();
    }

    public void register(Event event){
        events.add(event);
    }

    public abstract void onEvent(Event event);
}
