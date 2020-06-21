package com.example.gofp.head_first.sol.structural.decorator.classes;

import androidx.annotation.NonNull;

import java.util.Locale;

public abstract class Beverage {
    protected String description;

    public Beverage() {
      this.description = "Unknown Beverage";
    }

    public abstract double cost();

    public String getDescription() {
        return description;
    }

    @NonNull
    @Override
    public String toString() {
        return String.format(Locale.ENGLISH,"%s cost: %.2f",getDescription(),cost());
    }
}
