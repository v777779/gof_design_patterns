package com.example.gofp.head_first.sol.behavioral.mediator.classes;

import com.example.gofp.binding.Systems;

public class CoffeePot implements Event {
    private AbstractMediator mediator;
    private String name;

    public CoffeePot(AbstractMediator mediator) {
        this.mediator = mediator;
        this.name = getClass().getSimpleName();
    }

    @Override
    public void check() {
        Systems.out.println(name + ": checked");
    }

    @Override
    public void execute(String command) {
        Systems.out.println(name + ": " + command);
    }

    @Override
    public void onEvent() {
        mediator.onEvent(this);
    }

}
