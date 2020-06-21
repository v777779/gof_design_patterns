package com.example.gofp.head_first.pre.behavioral.visitor.classes.ingredients;

import androidx.annotation.NonNull;

import com.example.gofp.head_first.pre.behavioral.visitor.classes.Ingredient;

import java.util.Locale;

public class Butter extends Ingredient {

    public Butter(float amount) {
        super(amount);
    }

    @Override
    public boolean isVegetarian() {
        return false;
    }

    @Override
    public double getCalories() {
        return 141;
    }

    @Override
    public double getCarbs() {
        return 0;
    }

    @Override
    public double getFat() {
        return 16;
    }

    @Override
    public double getCholesterol() {
        return 0.3;
    }

    @Override
    public double getProtein() {
        return 1;
    }

    @Override
    public double getSodium() {
        return 0.127;
    }

    @NonNull
    @Override
    public String toString() {
        return String.format(Locale.ENGLISH, "Butter %.1f", amount);
    }
}
