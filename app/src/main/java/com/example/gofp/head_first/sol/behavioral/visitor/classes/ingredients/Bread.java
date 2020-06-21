package com.example.gofp.head_first.sol.behavioral.visitor.classes.ingredients;

import androidx.annotation.NonNull;

import com.example.gofp.head_first.sol.behavioral.visitor.classes.Ingredient;
import com.example.gofp.head_first.sol.behavioral.visitor.classes.MVisitor;

import java.util.Locale;

public class Bread extends Ingredient {

    public Bread(float amount) {
        super(amount);
    }

    @Override
    public void getState(MVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public boolean isVegetarian() {
        return true;
    }

    @Override
    public double getCalories() {
        return 120;
    }

    @Override
    public double getCarbs() {
        return 23;
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
        return 3;
    }

    @Override
    public double getSodium() {
        return 0.306;
    }

    @NonNull
    @Override
    public String toString() {
        return String.format(Locale.ENGLISH, "Bread %.1f", amount);
    }
}
