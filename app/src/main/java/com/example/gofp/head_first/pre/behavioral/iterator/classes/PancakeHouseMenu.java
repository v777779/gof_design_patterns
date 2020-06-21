package com.example.gofp.head_first.pre.behavioral.iterator.classes;

import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenu {
    private static final String[] ITEM_NAMES = {
            "K&B Pancake Breakfast",
            "Regular Pancake Breakfast",
            "Blueberry Pancakes",
            "Waffles",
    };
    private static final String[] ITEM_DESCRIPTIONS = {
            "Pancakes with scrambled eggs and toast",
            "Pancakes with fried eggs, sausage",
            "Pancakes made with fresh blueberries",
            "Waffles, with your chice of blueberries or strawberries",
    };
    private static final double[] ITEM_PRICES = {2.99, 2.99, 3.49, 3.59};
    private static final boolean[] ITEM_VEGETARIAN = {false, false, true, true};
    private List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        this.menuItems = new ArrayList<>();
        for (int i = 0; i < ITEM_NAMES.length; i++) {
            addItem(ITEM_NAMES[i], ITEM_DESCRIPTIONS[i], ITEM_VEGETARIAN[i], ITEM_PRICES[i]);
        }
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
}
