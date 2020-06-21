package com.example.gofp.udemy.sol.structural.bridge.classes;

import com.example.gofp.binding.Systems;

public class Toyota implements Model {

    @Override
    public void drive(String s) {
        Systems.out.println(s+" toyota");
    }
}
