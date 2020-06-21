package com.example.gofp.head_first.pre.structural.composite.classes;

import androidx.annotation.NonNull;

import java.util.Locale;

public class MenuItem {
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }

    @NonNull
    @Override
    public String toString() {
        return  String.format(Locale.ENGLISH,"%s, %.2f -- %s",
                name,price,description);
    }
}
