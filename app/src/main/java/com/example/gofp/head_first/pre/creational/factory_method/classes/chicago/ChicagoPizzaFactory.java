package com.example.gofp.head_first.pre.creational.factory_method.classes.chicago;


import com.example.gofp.head_first.pre.creational.factory_method.classes.Pizza;
import com.example.gofp.head_first.pre.creational.factory_method.classes.SimpleFactory;

public class ChicagoPizzaFactory extends SimpleFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type == null) {
            return null;
        }

        switch (type) {
            case "cheese":
                pizza = new ChicagoCheesePizza();
                break;
            case "pepperoni":
                pizza = new ChicagoPepperoniPizza();
                break;
            case "clam":
                pizza = new ChicagoClamPizza();
                break;
            case "veggie":
                pizza = new ChicagoVeggiePizza();
                break;
        }
        return pizza;
    }
}
