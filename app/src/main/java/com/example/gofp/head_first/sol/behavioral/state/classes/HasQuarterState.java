package com.example.gofp.head_first.sol.behavioral.state.classes;

import com.example.gofp.binding.Systems;

import java.util.Random;

public class HasQuarterState implements States {
    private Random random;
    private GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
        this.random = new Random(System.currentTimeMillis()); // init with core
    }

    @Override
    public void insertQuarter() {
        Systems.out.println("You can't insert another quarter");

    }

    @Override
    public void ejectQuarter() {
        Systems.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        Systems.out.println("You turned...");
        int winner = random.nextInt(10);
        if (winner > 5 && gumballMachine.getCount() > 1){
            gumballMachine.setState(gumballMachine.getWinnerState());
        }else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        Systems.out.println("No gumball dispensed");
    }
}
