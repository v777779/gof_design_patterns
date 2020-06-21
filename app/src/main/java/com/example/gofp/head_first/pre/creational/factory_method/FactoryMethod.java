package com.example.gofp.head_first.pre.creational.factory_method;

import com.example.gofp.binding.BasePattern;
import com.example.gofp.binding.Systems;
import com.example.gofp.head_first.pre.creational.factory_method.classes.PizzaStore;
import com.example.gofp.head_first.pre.creational.factory_method.classes.chicago.ChicagoPizzaFactory;
import com.example.gofp.head_first.pre.creational.factory_method.classes.ny.NYPizzaFactory;

public class FactoryMethod extends BasePattern {
    @Override
    public void main() {
        PizzaStore nyStore = new PizzaStore(new NYPizzaFactory());
        nyStore.orderPizza("cheese");

        Systems.out.println();

        PizzaStore chicagoStore = new PizzaStore(new ChicagoPizzaFactory());
        chicagoStore.orderPizza("cheese");


    }
}
