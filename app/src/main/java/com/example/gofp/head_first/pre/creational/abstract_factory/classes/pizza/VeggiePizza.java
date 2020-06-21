package com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza;

import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.cheese.Cheese;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.dough.Dough;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.sauce.Sauce;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.veggie.Veggies;

public class VeggiePizza extends Pizza {

    public VeggiePizza(Dough dough, Sauce sauce, Veggies[] veggies, Cheese cheese) {
        super(dough, sauce, veggies, cheese, null, null);
    }
}
