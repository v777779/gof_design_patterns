package com.example.gofp.head_first.sol.behavioral.state.classes;

import androidx.annotation.NonNull;

import com.example.gofp.binding.Systems;

import java.util.Locale;

public class GumballMachine {
    private States soldOutState;
    private States noQuarterState;
    private States hasQuarterState;
    private States soldState;
    private States  winnerState;

    private States currentState;
    private int count = 0;

    public GumballMachine(int count) {
        this.soldOutState = new SoldOutState(this);
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldState = new SoldState(this);
        this.winnerState = new WinnerState(this);

        this.count = count;
        if (count > 0) {
            this.currentState = noQuarterState;
        } else {
            this.currentState = soldOutState;
        }
    }

    public void insertQuarter() {
        currentState.insertQuarter();
    }

    public void ejectQuarter() {
        currentState.ejectQuarter();
    }

    public void turnCrank() {
        currentState.turnCrank();
        currentState.dispense(); // called for A NEW state
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setState(States state) {
        this.currentState = state;
    }

    public States getSoldOutState() {
        return soldOutState;
    }

    public States getNoQuarterState() {
        return noQuarterState;
    }

    public States getHasQuarterState() {
        return hasQuarterState;
    }

    public States getSoldState() {
        return soldState;
    }

    public States getWinnerState() {
        return winnerState;
    }

    private String stateDescription(States currentState) {
        if (currentState instanceof SoldOutState) {
            return "Machine is sold out";
        } else if (currentState instanceof NoQuarterState) {
            return "Machine is waiting for quarter";
        } else if (currentState instanceof HasQuarterState) {

            return "Machine is waiting for turn of crank";
        } else if (currentState instanceof SoldState) {

            return "Machine is waiting for delivering a gumball";
        } else {
            throw new IllegalArgumentException();
        }
    }

    @NonNull
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Systems.out.lineSeparator());
        sb.append("Mighty Gumball, Inc");
        sb.append(Systems.out.lineSeparator());
        sb.append("Java-enabled Standing Gumball Model #2004");
        sb.append(Systems.out.lineSeparator());
        if (count == 1) {
            sb.append(String.format(Locale.ENGLISH, "Inventory: %d gumball", count));
        } else {
            sb.append(String.format(Locale.ENGLISH, "Inventory: %d gumballs", count));
        }
        sb.append(Systems.out.lineSeparator());
        sb.append(stateDescription(currentState));
        sb.append(Systems.out.lineSeparator());

        return sb.toString();
    }
}
