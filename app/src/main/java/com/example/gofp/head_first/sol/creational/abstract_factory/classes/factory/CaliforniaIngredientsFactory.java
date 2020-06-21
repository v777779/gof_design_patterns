package com.example.gofp.head_first.sol.creational.abstract_factory.classes.factory;

import com.example.gofp.head_first.sol.creational.abstract_factory.classes.pizza_ingredients.PizzaIngredientFactory;
import com.example.gofp.head_first.sol.creational.abstract_factory.classes.pizza_ingredients.cheese.Cheese;
import com.example.gofp.head_first.sol.creational.abstract_factory.classes.pizza_ingredients.cheese.ProvoloneCheese;
import com.example.gofp.head_first.sol.creational.abstract_factory.classes.pizza_ingredients.clam.Calamari;
import com.example.gofp.head_first.sol.creational.abstract_factory.classes.pizza_ingredients.clam.Clams;
import com.example.gofp.head_first.sol.creational.abstract_factory.classes.pizza_ingredients.dough.Dough;
import com.example.gofp.head_first.sol.creational.abstract_factory.classes.pizza_ingredients.dough.VeryThinCrust;
import com.example.gofp.head_first.sol.creational.abstract_factory.classes.pizza_ingredients.pepperoni.Pepperoni;
import com.example.gofp.head_first.sol.creational.abstract_factory.classes.pizza_ingredients.pepperoni.SlicedPepperoni;
import com.example.gofp.head_first.sol.creational.abstract_factory.classes.pizza_ingredients.sauce.BruschettaSauce;
import com.example.gofp.head_first.sol.creational.abstract_factory.classes.pizza_ingredients.sauce.Sauce;
import com.example.gofp.head_first.sol.creational.abstract_factory.classes.pizza_ingredients.veggie.Garlic;
import com.example.gofp.head_first.sol.creational.abstract_factory.classes.pizza_ingredients.veggie.Mushroom;
import com.example.gofp.head_first.sol.creational.abstract_factory.classes.pizza_ingredients.veggie.Onion;
import com.example.gofp.head_first.sol.creational.abstract_factory.classes.pizza_ingredients.veggie.RedPepper;
import com.example.gofp.head_first.sol.creational.abstract_factory.classes.pizza_ingredients.veggie.Veggies;

public class CaliforniaIngredientsFactory implements PizzaIngredientFactory {


    @Override
    public Dough createDough() {
        return new VeryThinCrust();
    }

    @Override
    public Sauce createSauce() {
        return new BruschettaSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ProvoloneCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return  new Veggies[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new Calamari();
    }
}
