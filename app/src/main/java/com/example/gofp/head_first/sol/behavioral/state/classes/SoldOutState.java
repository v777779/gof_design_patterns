package com.example.gofp.head_first.sol.behavioral.state.classes;

import com.example.gofp.binding.Systems;

public class SoldOutState implements States {
    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }


    @Override
    public void insertQuarter() {
        Systems.out.println("You can't insert a quarter, the machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        Systems.out.println("You can't eject, you haven't inserted a quarter yet");
    }

    @Override
    public void turnCrank() {
        Systems.out.println("You turned but there are no gumballs");
    }

    @Override
    public void dispense() {
        Systems.out.println("No gumball dispensed");
    }
}
