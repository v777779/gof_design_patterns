package com.example.gofp.head_first.sol.creational.factory_method;

import com.example.gofp.binding.Systems;
import com.example.gofp.head_first.sol.creational.factory_method.classes.PizzaStore;
import com.example.gofp.head_first.sol.creational.factory_method.classes.chicago.ChicagoPizzaStore;
import com.example.gofp.head_first.sol.creational.factory_method.classes.ny.NYPizzaStore;
import com.example.gofp.binding.BasePattern;

public class FactoryMethod extends BasePattern {
    @Override
    public void main() {
        PizzaStore nyStore = new NYPizzaStore();
        nyStore.orderPizza("cheese");
        Systems.out.println();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        chicagoStore.orderPizza("cheese");
    }
}
