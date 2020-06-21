package com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients;

import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.cheese.Cheese;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.clam.Clams;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.dough.Dough;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.pepperoni.Pepperoni;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.sauce.Sauce;
import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza_ingredients.veggie.Veggies;

public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();

}
