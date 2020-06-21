package com.example.gofp.head_first.pre.behavioral.visitor.classes.ingredients;

import androidx.annotation.NonNull;

import com.example.gofp.head_first.pre.behavioral.visitor.classes.Ingredient;

import java.util.Locale;

public class Rice extends Ingredient {

    public Rice(float amount) {
        super(amount);
    }

    @Override
    public boolean isVegetarian() {
        return true;
    }

    @Override
    public double getCalories() {
        return 194;
    }

    @Override
    public double getCarbs() {
        return 41;
    }

    @Override
    public double getFat() {
        return 1;
    }

    @Override
    public double getCholesterol() {
        return 0;
    }

    @Override
    public double getProtein() {
        return 0;
    }

    @Override
    public double getSodium() {
        return 0.3;
    }

    @NonNull
    @Override
    public String toString() {
        return String.format(Locale.ENGLISH, "Rice %.1f", amount);
    }
}
