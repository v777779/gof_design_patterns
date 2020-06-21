package com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza;

import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.cheese.Cheese;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.clam.Clams;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.dough.Dough;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.sauce.Sauce;

public class ClamPizza extends Pizza {

    public ClamPizza(Dough dough, Sauce sauce, Cheese cheese, Clams clam) {
        super(dough, sauce, null, cheese, null, clam);
    }

}
