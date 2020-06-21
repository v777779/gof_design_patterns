package com.example.gofp.head_first.pre.behavioral.visitor.classes.ingredients;

import androidx.annotation.NonNull;

import com.example.gofp.head_first.pre.behavioral.visitor.classes.Ingredient;

import java.util.Locale;

public class Beef extends Ingredient {

    public Beef(float amount) {
        super(amount);
    }

    @Override
    public boolean isVegetarian() {
        return false;
    }

    @Override
    public double getCalories() {
        return 1320;
    }

    @Override
    public double getCarbs() {
        return 0;
    }

    @Override
    public double getFat() {
        return 1;
    }

    @Override
    public double getCholesterol() {
        return 0.336;
    }

    @Override
    public double getProtein() {
        return 79;
    }

    @Override
    public double getSodium() {
        return 0.286;
    }

    @NonNull
    @Override
    public String toString() {
        return String.format(Locale.ENGLISH, "Beef %.1f", amount);
    }
}
