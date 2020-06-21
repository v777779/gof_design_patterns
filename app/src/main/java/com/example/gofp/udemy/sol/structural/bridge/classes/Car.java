package com.example.gofp.udemy.sol.structural.bridge.classes;

public class Car extends Vehicle {

        public Car(Model model) {
            super(model);
        }

        @Override
        public void drive() {
            model.drive("drive car");
        }
    }