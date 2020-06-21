package com.example.gofp.head_first.pre.creational.factory_method.classes.ny;


import com.example.gofp.head_first.pre.creational.factory_method.classes.Pizza;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        this.name = "NY Style Sauce and Cheese Pizza";
        this.dough = "Thin Crust Dough";
        this.sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }

}
