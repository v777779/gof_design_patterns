package com.example.gofp.head_first.pre.creational.abstract_factory.classes.store;

import com.example.gofp.head_first.pre.creational.abstract_factory.classes.PizzaStore;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza.CheesePizza;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza.ClamPizza;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza.PepperoniPizza;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza.Pizza;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza.VeggiePizza;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.cheese.ProvoloneCheese;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.clam.Calamari;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.dough.VeryThinCrust;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.pepperoni.SlicedPepperoni;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.sauce.BruschettaSauce;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.veggie.Garlic;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.veggie.Mushroom;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.veggie.Onion;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.veggie.RedPepper;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.veggie.Veggies;

public class CaliforniaPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type == null) {
            return null;
        }

        switch (type) {
            case "cheese":
                pizza = new CheesePizza(new VeryThinCrust(),new BruschettaSauce(),
                        new ProvoloneCheese());
                pizza.setName("California Style Cheese Pizza");
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(new VeryThinCrust(),new BruschettaSauce(),
                        new ProvoloneCheese(),new SlicedPepperoni());
                pizza.setName("California Style Pepperoni Pizza");
                break;
            case "clam":
                pizza = new ClamPizza(new VeryThinCrust(),new BruschettaSauce(),
                        new ProvoloneCheese(),new Calamari());
                pizza.setName("California Style Clam Pizza");
                break;
            case "veggie":
                pizza = new VeggiePizza(new VeryThinCrust(),new BruschettaSauce(),
                        new Veggies[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()},
                        new ProvoloneCheese());
                pizza.setName("California Style Veggie Pizza");
                break;
        }
        return pizza;
    }
}
