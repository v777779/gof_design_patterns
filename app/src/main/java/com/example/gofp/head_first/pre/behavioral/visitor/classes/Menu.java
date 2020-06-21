package com.example.gofp.head_first.pre.behavioral.visitor.classes;

import androidx.annotation.NonNull;

import com.example.gofp.binding.Systems;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<MenuItem> items;
    private String name;
    private String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
        this.items = new ArrayList<>();
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public double getHealthRating() {
        double rating = 0;
        for (MenuItem item : items) {
            rating += item.getHealthRating();
        }
        return rating;
    }

    public void add(MenuItem item) {
        items.add(item);
    }

    public boolean isVegetarian() {
        for (MenuItem item : items) {
            if (!item.isVegetarian()) {
                return false;
            }
        }
        return true;
    }


    @NonNull
    @Override
    public String toString() {
        return "Menu: " + name
                + Systems.out.lineSeparator()
                + description;
    }
}
