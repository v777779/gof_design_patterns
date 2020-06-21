package com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza;

import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.cheese.Cheese;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.dough.Dough;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.pepperoni.Pepperoni;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.sauce.Sauce;

public class PepperoniPizza extends Pizza {

    public PepperoniPizza(Dough dough, Sauce sauce, Cheese cheese, Pepperoni pepperoni) {
        super(dough, sauce, null, cheese, pepperoni, null);
    }

}
