package com.example.gofp.udemy.sol.structural.bridge.classes;

public abstract class Vehicle {
    Model model;

    Vehicle(Model model) {
        this.model = model;
    }

    public abstract void drive();
}