package com.example.gofp.head_first.pre.creational.abstract_factory.classes.store;

import com.example.gofp.head_first.pre.creational.abstract_factory.classes.PizzaStore;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza.CheesePizza;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza.ClamPizza;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza.PepperoniPizza;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza.Pizza;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza.VeggiePizza;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.cheese.ReggianoCheese;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.clam.FreshClams;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.dough.ThickCrustDough;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.pepperoni.SlicedPepperoni;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.sauce.MarinaSauce;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.veggie.Garlic;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.veggie.Mushroom;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.veggie.Onion;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.veggie.RedPepper;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.veggie.Veggies;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type == null) {
            return null;
        }

        switch (type) {
            case "cheese":
                pizza = new CheesePizza(new ThickCrustDough(), new MarinaSauce(),
                        new ReggianoCheese());
                pizza.setName("New York Style Cheese Pizza");
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(new ThickCrustDough(), new MarinaSauce(),
                        new ReggianoCheese(), new SlicedPepperoni());
                pizza.setName("New York Style Pepperoni Pizza");
                break;
            case "clam":
                pizza = new ClamPizza(new ThickCrustDough(), new MarinaSauce(),
                        new ReggianoCheese(), new FreshClams());
                pizza.setName("New York Style Clam Pizza");
                break;
            case "veggie":
                pizza = new VeggiePizza(new ThickCrustDough(), new MarinaSauce(),
                        new Veggies[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()},
                        new ReggianoCheese());
                pizza.setName("New York Style Veggie Pizza");
                break;
        }
        return pizza;
    }
}
