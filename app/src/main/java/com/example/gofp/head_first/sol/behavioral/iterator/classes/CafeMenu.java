package com.example.gofp.head_first.sol.behavioral.iterator.classes;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu {
    private static final String[] ITEM_NAMES = {
            "Veggi Burger and Air Fries",
            "Soup of the day",
            "Burrito",
    };
    private static final String[] ITEM_DESCRIPTIONS = {
            "Veggi burger ona  whole wheat bun, lettuce, tomato, and fries",
            "A cup of the soup of the day, with a side salad",
            "A large burrito, with whole pinto beans, salsa, guacamole",
    };
    private static final double[] ITEM_PRICES = {3.99, 3.69, 4.29};
    private static final boolean[] ITEM_VEGETARIAN = {true, false, true};
    private Hashtable<String, MenuItem> menuItems;

    public CafeMenu() {
        this.menuItems = new Hashtable<>();
        for (int i = 0; i < ITEM_NAMES.length; i++) {
            addItem(ITEM_NAMES[i], ITEM_DESCRIPTIONS[i], ITEM_VEGETARIAN[i], ITEM_PRICES[i]);
        }
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(name, menuItem);
    }

    @Override
    public Iterator<MenuItem> iterator() {
        return menuItems.values().iterator();
    }
}
