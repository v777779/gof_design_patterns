package com.example.gofp.head_first.sol.behavioral.visitor.classes;

public abstract class Ingredient {
    private static final float DAILY_CALORIES = 2000.0f;
    private static final float DAILY_CARBS = 300.f;
    private static final float DAILY_CHOLESTEROL = 0.300f;
    private static final float DAILY_FAT = 65.0f;
    private static final float DAILY_PROTEIN = 50.0f;
    private static final float DAILY_SODIUM = 2.400f;

    protected double amount;

    public Ingredient(float amount) {
        this.amount = amount;
    }

    public abstract void getState(MVisitor visitor);

    public abstract boolean isVegetarian();

    public abstract double getCalories();

    public abstract double getCarbs();

    public abstract double getFat();

    public abstract double getCholesterol();

    public abstract double getProtein();

    public abstract double getSodium();

    public double getAmount() {
        return amount;
    }

    public double getHealthRating() {
        double result = 0.0f;

        result += getCalories() / DAILY_CALORIES;
        result += getCarbs() / DAILY_CARBS;
        result += getCholesterol() / DAILY_CHOLESTEROL;
        result += getProtein() / DAILY_PROTEIN;
        result += getSodium() / DAILY_SODIUM;

        return amount * (result * 100.0f);
    }
}
