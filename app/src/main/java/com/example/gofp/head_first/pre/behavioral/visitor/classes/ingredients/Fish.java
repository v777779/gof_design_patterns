package com.example.gofp.head_first.pre.behavioral.visitor.classes.ingredients;

import androidx.annotation.NonNull;

import com.example.gofp.head_first.pre.behavioral.visitor.classes.Ingredient;

import java.util.Locale;

public class Fish extends Ingredient {

    public Fish(float amount) {
        super(amount);
    }

    @Override
    public boolean isVegetarian() {
        return true;
    }

    @Override
    public double getCalories() {
        return 189;
    }

    @Override
    public double getCarbs() {
        return 0;
    }

    @Override
    public double getFat() {
        return 2;
    }

    @Override
    public double getCholesterol() {
        return 0.99;
    }

    @Override
    public double getProtein() {
        return 41;
    }

    @Override
    public double getSodium() {
        return 0.125;
    }

    @NonNull
    @Override
    public String toString() {
        return String.format(Locale.ENGLISH, "Fish %.1f", amount);
    }
}
