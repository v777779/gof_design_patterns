package com.example.gofp.head_first.sol.behavioral.state.classes;

import com.example.gofp.binding.Systems;

public class NoQuarterState implements States {
    private GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        Systems.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        Systems.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        Systems.out.println("You turned but there's no quarter");
    }

    @Override
    public void dispense() {
        Systems.out.println("You need pay first");
    }
}
