package com.example.gofp.udemy.pre.creational.abstract_factory;

import com.example.gofp.binding.Systems;
import com.example.gofp.binding.BasePattern;

public class AbstractFactory extends BasePattern {
    @Override
    public void main() {
        Systems.out.println(getClass().getSimpleName());
    }
}
