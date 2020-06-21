package com.example.gofp.head_first.pre.structural.decorator.classes;

import androidx.annotation.NonNull;

import java.util.Locale;

public abstract class Beverage {
    protected String description;

     public String getDescription() {
        return description;
    }

    public abstract float cost();

    @NonNull
    @Override
    public String toString() {
        return String.format(Locale.ENGLISH,"%s cost: %.2f",getDescription(),cost());
    }
}
