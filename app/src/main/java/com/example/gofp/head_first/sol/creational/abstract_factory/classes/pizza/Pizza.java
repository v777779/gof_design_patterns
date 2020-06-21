package com.example.gofp.head_first.sol.creational.abstract_factory.classes.pizza;

import androidx.annotation.NonNull;

import com.example.gofp.binding.Systems;
import com.example.gofp.head_first.sol.creational.abstract_factory.classes.pizza_ingredients.PizzaIngredientFactory;
import com.example.gofp.head_first.sol.creational.abstract_factory.classes.pizza_ingredients.cheese.Cheese;
import com.example.gofp.head_first.sol.creational.abstract_factory.classes.pizza_ingredients.clam.Clams;
import com.example.gofp.head_first.sol.creational.abstract_factory.classes.pizza_ingredients.dough.Dough;
import com.example.gofp.head_first.sol.creational.abstract_factory.classes.pizza_ingredients.pepperoni.Pepperoni;
import com.example.gofp.head_first.sol.creational.abstract_factory.classes.pizza_ingredients.sauce.Sauce;
import com.example.gofp.head_first.sol.creational.abstract_factory.classes.pizza_ingredients.veggie.Veggies;

public abstract class Pizza {

    protected PizzaIngredientFactory factory;

    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies[] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clam;

    public Pizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    public abstract void prepare();

    public void bake() {
        Systems.out.println("Bake for 25 minutes at 350C");
    }

    public void cut() {
        Systems.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        Systems.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NonNull
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String cr = String.format("%n");
        sb.append("Pizza: ").append(name).append(cr);
        if (dough != null) {
            sb.append(" - ").append(dough.getClass().getSimpleName()).append(cr);
        }
        if (sauce != null) {
            sb.append(" - ").append(sauce.getClass().getSimpleName()).append(cr);
        }
        if (veggies != null && veggies.length > 0) {

            for (Veggies veggy : veggies) {
                sb.append(" - ").append(veggy.getClass().getSimpleName()).append(" ").append(cr);
            }
        }
        if (cheese != null) {
            sb.append(" - ").append(cheese.getClass().getSimpleName()).append(cr);
        }
        if (pepperoni != null) {
            sb.append(" - ").append(sauce.getClass().getSimpleName()).append(cr);
        }
        if (clam != null) {
            sb.append(" - ").append(sauce.getClass().getSimpleName()).append(cr);
        }
        return sb.toString();

    }
}
