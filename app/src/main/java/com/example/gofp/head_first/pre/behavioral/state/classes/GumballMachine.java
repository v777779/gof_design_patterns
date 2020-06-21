package com.example.gofp.head_first.pre.behavioral.state.classes;

import androidx.annotation.NonNull;

import com.example.gofp.binding.Systems;

import java.util.Locale;

public class GumballMachine {
    public static final int SOLD_OUT = 0;
    public static final int NO_QUARTER = 1;
    public static final int HAS_QUARTER = 2;
    public static final int SOLD = 3;

    private int state;
    private int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            this.state = NO_QUARTER;
        }

    }

    public void insertQuarter() {
        switch (state) {
            case SOLD_OUT:
                Systems.out.println("You can't insert a quarter, the machine is sold out");
                break;
            case NO_QUARTER:
                Systems.out.println("You inserted a quarter");
                state = HAS_QUARTER;
                break;
            case HAS_QUARTER:
                Systems.out.println("You can't insert another quarter");
                break;
            case SOLD:
                Systems.out.println("Please wait, we are already giving you a gumball");
                break;
        }
    }

    public void ejectQuarter() {
        switch (state) {
            case SOLD_OUT:
                Systems.out.println("You can't eject, you haven't inserted a quarter yet");
                break;
            case NO_QUARTER:
                Systems.out.println("You haven't inserted a quarter");
                break;
            case HAS_QUARTER:
                Systems.out.println("Quarter returned");
                state = NO_QUARTER;
                break;
            case SOLD:
                Systems.out.println("Sorry, you already turned a crank");
                break;
        }
    }

    public void turnCrank() {
        switch (state) {
            case SOLD_OUT:
                Systems.out.println("You turned but there are no gumballs");
                break;
            case NO_QUARTER:
                Systems.out.println("You turned but there's no quarter");
                break;
            case HAS_QUARTER:
                Systems.out.println("You turned...");
                state = SOLD;
                dispense();
                break;
            case SOLD:
                Systems.out.println("Turning twice doesn't get you another gumball");
                break;
        }
    }

    public void dispense() {
        switch (state) {
            case SOLD_OUT:
                Systems.out.println("No gumball dispensed");
                break;
            case NO_QUARTER:
                Systems.out.println("You need pay first");
                break;
            case HAS_QUARTER:
                Systems.out.println("No gumball dispensed");
                break;
            case SOLD:
                Systems.out.println("A gumball comes rolling out the slot");
                count--;
                if (count == 0) {
                    Systems.out.println("Oops, out of gumballs!");
                    state = SOLD_OUT;
                } else {
                    state = NO_QUARTER;
                }
                break;
        }
    }

    private String stateDescription(int state) {
        switch (state) {
            case SOLD_OUT:
                return "Machine is sold out";
            case NO_QUARTER:
                return "Machine is waiting for quarter";
            case HAS_QUARTER:
                return "Machine is waiting for turn of crank";
            case SOLD:
                return "Machine is waiting for delivering a gumball";
            default:
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
        sb.append(stateDescription(state));
        sb.append(Systems.out.lineSeparator());

        return sb.toString();
    }
}
