package com.example.gofp.head_first.sol.behavioral.visitor.classes.ingredients;

import androidx.annotation.NonNull;

import com.example.gofp.head_first.sol.behavioral.visitor.classes.Ingredient;
import com.example.gofp.head_first.sol.behavioral.visitor.classes.MVisitor;

import java.util.Locale;

public class Milk extends Ingredient {

    public Milk(float amount) {
        super(amount);
    }

    @Override
    public void getState(MVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public boolean isVegetarian() {
        return false;
    }

    @Override
    public double getCalories() {
        return 146;
    }

    @Override
    public double getCarbs() {
        return 11;
    }

    @Override
    public double getFat() {
        return 8;
    }

    @Override
    public double getCholesterol() {
        return 0;
    }

    @Override
    public double getProtein() {
        return 8;
    }

    @Override
    public double getSodium() {
        return 0.98;
    }

    @NonNull
    @Override
    public String toString() {
        return String.format(Locale.ENGLISH, "Milk %.1f", amount);
    }
}
