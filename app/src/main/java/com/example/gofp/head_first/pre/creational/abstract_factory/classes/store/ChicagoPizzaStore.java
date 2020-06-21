package com.example.gofp.head_first.pre.creational.abstract_factory.classes.store;

import com.example.gofp.head_first.pre.creational.abstract_factory.classes.PizzaStore;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza.CheesePizza;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza.ClamPizza;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza.PepperoniPizza;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza.Pizza;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza.VeggiePizza;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.cheese.MozarrellaCheese;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.clam.FrozenClams;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.dough.ThickCrustDough;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.pepperoni.SlicedPepperoni;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.sauce.PlumTomatoSauce;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.veggie.BlackOlives;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.veggie.EggPlant;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.veggie.RedPepper;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.veggie.Spinach;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.veggie.Veggies;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type == null) {
            return null;
        }

         switch (type) {
            case "cheese":
                pizza = new CheesePizza(new ThickCrustDough(), new PlumTomatoSauce(),
                        new MozarrellaCheese());
                pizza.setName("Chicago Style Cheese Pizza");
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(new ThickCrustDough(), new PlumTomatoSauce(),
                        new MozarrellaCheese(), new SlicedPepperoni());
                pizza.setName("Chicago Style Pepperoni Pizza");
                break;
            case "clam":
                pizza = new ClamPizza(new ThickCrustDough(), new PlumTomatoSauce(),
                        new MozarrellaCheese(), new FrozenClams());
                pizza.setName("Chicago Style Clam Pizza");
                break;
            case "veggie":
                pizza = new VeggiePizza(new ThickCrustDough(), new PlumTomatoSauce(),
                        new Veggies[]{new Spinach(), new BlackOlives(), new EggPlant(),
                                new RedPepper()}, new MozarrellaCheese());
                pizza.setName("Chicago Style Veggie Pizza");
                break;
        }
        return pizza;
    }
}
