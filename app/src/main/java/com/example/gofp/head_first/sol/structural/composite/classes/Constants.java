package com.example.gofp.head_first.sol.structural.composite.classes;

import java.util.ArrayList;
import java.util.List;

public class Constants {
    public static final int PANCAKE_INDEX = 0;
    public static final int DINNER_INDEX = 0;
    public static final int CAFE_INDEX = 0;

// classes

    public static class AllMenus {
        public static final String TITLE = "ALL MENUS";
        public static final String DESCRIPTION = "All menus combined";
    }

    public static class Pancake {
        public static final String TITLE = "PANCAKE HOUSE MENU";
        public static final String DESCRIPTION = "Breakfast";
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
                "Waffles, with your choice of blueberries or strawberries",
        };
        private static final double[] ITEM_PRICES = {2.99, 2.99, 3.49, 3.59};
        private static final boolean[] ITEM_VEGETARIAN = {true, false, true, true};

        public static List<MenuItem> get() {
            List<MenuItem> list = new ArrayList<>();
            for (int i = 0; i < ITEM_NAMES.length; i++) {
                list.add(new MenuItem(ITEM_NAMES[i], ITEM_DESCRIPTIONS[i], ITEM_VEGETARIAN[i], ITEM_PRICES[i]));
            }
            return list;
        }
    }

    public static class Dinner {
        public static final String TITLE = "DINNER MENU";
        public static final String DESCRIPTION = "Lunch";
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


        public static List<MenuItem> get() {
            List<MenuItem> list = new ArrayList<>();
            for (int i = 0; i < ITEM_NAMES.length; i++) {
                list.add(new MenuItem(ITEM_NAMES[i], ITEM_DESCRIPTIONS[i], ITEM_VEGETARIAN[i], ITEM_PRICES[i]));
            }
            return list;
        }
    }

    public static class Cafe {
        public static final String TITLE = "CAFE MENU";
        public static final String DESCRIPTION = "Dinner";
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


        public static List<MenuItem> get() {
            List<MenuItem> list = new ArrayList<>();
            for (int i = 0; i < ITEM_NAMES.length; i++) {
                list.add(new MenuItem(ITEM_NAMES[i], ITEM_DESCRIPTIONS[i], ITEM_VEGETARIAN[i], ITEM_PRICES[i]));
            }
            return list;
        }
    }

    public static class Dessert {
        public static final String TITLE = "DESSERT MENU";
        public static final String DESCRIPTION = "Dessert of course!";
        private static final String[] ITEM_NAMES = {
                "Apple Pie",
                "CheeseCake",
                "Sorbet"
        };
        private static final String[] ITEM_DESCRIPTIONS = {
                "Apple pie with a flakey crust, topped with vanilla ice cream",
                "Creamy New York cheesecake, with a chocolate graham crust",
                "A scoop of raspberry and a scoop of a lime",
        };
        private static final double[] ITEM_PRICES = {1.59, 1.99, 1.89};
        private static final boolean[] ITEM_VEGETARIAN = {true, true, true};


        public static List<MenuItem> get() {
            List<MenuItem> list = new ArrayList<>();
            for (int i = 0; i < ITEM_NAMES.length; i++) {
                list.add(new MenuItem(ITEM_NAMES[i], ITEM_DESCRIPTIONS[i], ITEM_VEGETARIAN[i], ITEM_PRICES[i]));
            }
            return list;
        }
    }


}
