package com.example.gofp.head_first.pre.creational.factory_method.classes;


public class PizzaStore {
    private SimpleFactory factory;

    public PizzaStore(SimpleFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
