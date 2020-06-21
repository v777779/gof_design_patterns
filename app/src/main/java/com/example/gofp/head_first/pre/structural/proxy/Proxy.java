package com.example.gofp.head_first.pre.structural.proxy;

import com.example.gofp.binding.BasePattern;
import com.example.gofp.head_first.pre.structural.proxy.classes.GumballMachine;
import com.example.gofp.head_first.pre.structural.proxy.classes.GumballMonitor;

public class Proxy extends BasePattern {
    @Override
    public void main() {
        GumballMachine machine = new GumballMachine("Seattle", 112);
        GumballMonitor monitor = new GumballMonitor(machine);
        monitor.report();


    }
}
