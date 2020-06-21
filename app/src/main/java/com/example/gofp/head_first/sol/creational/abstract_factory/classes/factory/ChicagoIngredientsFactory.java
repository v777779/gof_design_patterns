package com.example.gofp.head_first.sol.creational.abstract_factory.classes.factory;

import com.example.gofp.head_first.sol.creational.abstract_factory.classes.pizza_ingredients.PizzaIngredientFactory;
import com.example.gofp.head_first.sol.creational.abstract_factory.classes.pizza_ingredients.cheese.Cheese;
import com.example.gofp.head_first.sol.creational.abstract_factory.classes.pizza_ingredients.cheese.MozarrellaCheese;
import com.example.gofp.head_first.sol.creational.abstract_factory.classes.pizza_ingredients.clam.Clams;
import com.example.gofp.head_first.sol.creational.abstract_factory.classes.pizza_ingredients.clam.FrozenClams;
import com.example.gofp.head_first.sol.creational.abstract_factory.classes.pizza_ingredients.dough.Dough;
import com.example.gofp.head_first.sol.creational.abstract_factory.classes.pizza_ingredients.dough.ThickCrustDough;
import com.example.gofp.head_first.sol.creational.abstract_factory.classes.pizza_ingredients.pepperoni.Pepperoni;
import com.example.gofp.head_first.sol.creational.abstract_factory.classes.pizza_ingredients.pepperoni.SlicedPepperoni;
import com.example.gofp.head_first.sol.creational.abstract_factory.classes.pizza_ingredients.sauce.PlumTomatoSauce;
import com.example.gofp.head_first.sol.creational.abstract_factory.classes.pizza_ingredients.sauce.Sauce;
import com.example.gofp.head_first.sol.creational.abstract_factory.classes.pizza_ingredients.veggie.BlackOlives;
import com.example.gofp.head_first.sol.creational.abstract_factory.classes.pizza_ingredients.veggie.EggPlant;
import com.example.gofp.head_first.sol.creational.abstract_factory.classes.pizza_ingredients.veggie.RedPepper;
import com.example.gofp.head_first.sol.creational.abstract_factory.classes.pizza_ingredients.veggie.Spinach;
import com.example.gofp.head_first.sol.creational.abstract_factory.classes.pizza_ingredients.veggie.Veggies;

public class ChicagoIngredientsFactory implements PizzaIngredientFactory {


    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozarrellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return  new Veggies[]{new Spinach(), new BlackOlives(), new EggPlant(), new RedPepper()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
