package com.example.gofp.head_first.pre.structural.proxy.classes;

public class GumballMachine {
    private static final String[] STATES = {
            "sold out state",
            "waiting for quarter",
            "waiting for turn of crank",
            "waiting for delivering of gumball",
    };
    private static final int SOLD_OUT = 0;
    private static final int NO_QUARTER = 1;
    private static final int HAS_QUARTER = 2;
    private static final int SOLD = 3;

    private String location;
    private int count;
    private int state;

    public GumballMachine(String location, int count) {
        this.location = location;
        this.count = count;
        this.state = NO_QUARTER;
    }

    public String getState() {
        return STATES[state];
    }

    public int getCount() {
        return count;
    }

    public String getLocation() {
        return location;
    }
}
