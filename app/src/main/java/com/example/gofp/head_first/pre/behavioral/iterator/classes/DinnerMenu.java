package com.example.gofp.head_first.pre.behavioral.iterator.classes;

public class DinnerMenu {
    private static final String[] ITEM_NAMES = {
            "Vegetarian BLT",
            "BLT",
            "Soup of the day",
            "Hotdog",

    };
    private static final String[] ITEM_DESCRIPTIONS = {
            "Faking Bacon with lettuce & tomato on whole wheat",
            "Bacon with lettuce & tomato on whole wheat",
            "Soup of the day, with a side of potato salad",
            "Hot dog, with sour cabbage, relish, onions, topped with cheese",
    };
    private static final boolean[] ITEM_VEGETARIAN = {true, false, false, false};
    private static final double[] ITEM_PRICES = {2.99, 2.99, 3.29, 3.05};

    private MenuItem[] menuItems;
    private int numberOfItems;

    public DinnerMenu() {

        this.menuItems = new MenuItem[ITEM_NAMES.length];
        numberOfItems = 0;
        for (int i = 0; i < ITEM_NAMES.length; i++) {
            addItem(ITEM_NAMES[i], ITEM_DESCRIPTIONS[i], ITEM_VEGETARIAN[i], ITEM_PRICES[i]);
        }
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems[numberOfItems] = menuItem;
        numberOfItems++;
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

}
