package com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza;

import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.cheese.Cheese;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.dough.Dough;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.sauce.Sauce;

public class CheesePizza extends Pizza {

    public CheesePizza(Dough dough, Sauce sauce, Cheese cheese) {
        super(dough, sauce, null, cheese, null, null);

    }

}
