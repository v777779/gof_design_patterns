package com.example.gofp.plural.sol.creational.abstract_factory;

import com.example.gofp.binding.Systems;
import com.example.gofp.binding.BasePattern;

public class AbstractFactory extends BasePattern {
    @Override
    public void main() {
        Systems.out.println(getClass().getSimpleName());
    }
}
