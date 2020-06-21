package com.example.gofp.head_first.sol.creational.abstract_factory.classes.pizza;

import com.example.gofp.binding.Systems;
import com.example.gofp.head_first.sol.creational.abstract_factory.classes.pizza_ingredients.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {

    public VeggiePizza(PizzaIngredientFactory factory) {
        super(factory);
    }

    @Override
    public void prepare() {
        Systems.out.println("Preparing " + name);
        dough = factory.createDough();
        sauce = factory.createSauce();
        cheese = factory.createCheese();
        veggies = factory.createVeggies();
    }
}
