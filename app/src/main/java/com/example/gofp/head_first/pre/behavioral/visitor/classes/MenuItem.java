package com.example.gofp.head_first.pre.behavioral.visitor.classes;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MenuItem {
    private String name;
    private String description;
    private double price;
    private List<Ingredient> ingredients;

    public MenuItem(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.ingredients = new ArrayList<>();
    }

    public void add(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public double getPrice() {
        return price;
    }

    public double getHealthRating() {
        float rating = 0;
        for (Ingredient ingredient : ingredients) {
            rating += ingredient.getHealthRating();
        }
        return rating;
    }

    public boolean isVegetarian() {
        for (Ingredient ingredient : ingredients) {
            if (!ingredient.isVegetarian()) {
                return false;
            }
        }
        return true;
    }

    @NonNull
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MenuItem: ").append(name);
        if (isVegetarian()) {
            sb.append("(v)");
        }
        sb.append(String.format(Locale.ENGLISH, " $%.2f", price));
        return sb.toString();
    }
}
