package com.example.gofp.udemy.sol.structural.bridge.classes;

public class Track extends Vehicle {
        public Track(Model model) {
            super(model);
        }

        @Override
        public void drive() {
            model.drive("drive track");
        }
    }