package com.example.gofp.head_first.sol.creational.abstract_factory.classes.factory;

import com.example.gofp.head_first.sol.creational.abstract_factory.classes.pizza.CheesePizza;
import com.example.gofp.head_first.sol.creational.abstract_factory.classes.pizza.ClamPizza;
import com.example.gofp.head_first.sol.creational.abstract_factory.classes.pizza.PepperoniPizza;
import com.example.gofp.head_first.sol.creational.abstract_factory.classes.pizza.Pizza;
import com.example.gofp.head_first.sol.creational.abstract_factory.classes.pizza_ingredients.PizzaIngredientFactory;
import com.example.gofp.head_first.sol.creational.abstract_factory.classes.PizzaStore;
import com.example.gofp.head_first.sol.creational.abstract_factory.classes.pizza.VeggiePizza;

public class CaliforniaPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory factory = new CaliforniaIngredientsFactory();

        if (type == null) {
            return null;
        }

        switch (type) {
            case "cheese":
                pizza = new CheesePizza(factory);
                pizza.setName("California Style Cheese Pizza");
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(factory);
                pizza.setName("California Style Pepperoni Pizza");
                break;
            case "clam":
                pizza = new ClamPizza(factory);
                pizza.setName("California Style Clam Pizza");
                break;
            case "veggie":
                pizza = new VeggiePizza(factory);
                pizza.setName("California Style Veggie Pizza");
                break;
        }
        return pizza;
    }
}
