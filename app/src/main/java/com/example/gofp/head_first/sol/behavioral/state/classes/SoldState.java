package com.example.gofp.head_first.sol.behavioral.state.classes;

import com.example.gofp.binding.Systems;

public class SoldState implements States {
    private GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        Systems.out.println("Please wait, we are already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        Systems.out.println("Sorry, you already turned a crank");
    }

    @Override
    public void turnCrank() {
        Systems.out.println("Turning twice doesn't get you another gumball");
    }

    public void releaseBall() {
        Systems.out.println("A gumball comes rolling out the slot");
        gumballMachine.setCount(gumballMachine.getCount() - 1);
    }

    @Override
    public void dispense() {
        releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            Systems.out.println("Oops, out of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
