package com.example.gofp.head_first.pre.creational.factory_method.classes.chicago;


import com.example.gofp.binding.Systems;
import com.example.gofp.head_first.pre.creational.factory_method.classes.Pizza;

public class ChicagoCheesePizza extends Pizza {

    public ChicagoCheesePizza() {
        this.name = "Chicago Style Deep Dish Cheese Pizza";
        this.dough = "Extra Thick Crust Dough";
        this.sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut() {
        Systems.out.println("Cutting the pizza into square slices");
    }
}
