package com.example.gofp.head_first.pre.creational.abstract_factory.classes;


import com.example.gofp.head_first.pre.creational.abstract_factory.classes.pizza.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(String type);

}
