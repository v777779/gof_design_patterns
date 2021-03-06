package com.example.gofp.head_first.sol.creational.factory_method.classes.california;

import com.example.gofp.head_first.sol.creational.factory_method.classes.Pizza;
import com.example.gofp.head_first.sol.creational.factory_method.classes.PizzaStore;

public class CaliforniaPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type == null) {
            return null;
        }

        switch (type) {
            case "cheese":
                pizza = new CaliforniaCheesePizza();
                break;
            case "pepperoni":
                pizza = new CaliforniaPepperoniPizza();
                break;
            case "clam":
                pizza = new CaliforniaClamPizza();
                break;
            case "veggie":
                pizza = new CaliforniaVeggiePizza();
                break;
        }
        return pizza;
    }
}
