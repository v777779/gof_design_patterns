package com.example.gofp.head_first.pre.creational.factory_method.classes.ny;


import com.example.gofp.head_first.pre.creational.factory_method.classes.Pizza;
import com.example.gofp.head_first.pre.creational.factory_method.classes.SimpleFactory;

public class NYPizzaFactory extends SimpleFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type == null) {
            return null;
        }

        switch (type) {
            case "cheese":
                pizza = new NYStyleCheesePizza();
                break;
            case "pepperoni":
                pizza = new NYStylePepperoniPizza();
                break;
            case "clam":
                pizza = new NYStyleClamPizza();
                break;
            case "veggie":
                pizza = new NYStyleVeggiePizza();
                break;
        }
        return pizza;
    }
}
