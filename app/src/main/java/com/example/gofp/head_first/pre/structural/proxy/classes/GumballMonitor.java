package com.example.gofp.head_first.pre.structural.proxy.classes;

import com.example.gofp.binding.Systems;

public class GumballMonitor {
    private GumballMachine machine;

    public GumballMonitor(GumballMachine machine) {
        this.machine = machine;
    }

    public void report() {
        Systems.out.println("GumballMachine: " + machine.getLocation());
        Systems.out.println("Count inventory: " + machine.getCount()+" gumballs");
        Systems.out.println("Current state: " + machine.getState());
    }
}
