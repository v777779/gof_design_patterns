package com.example.gofp.head_first.sol.creational.abstract_factory;


import com.example.gofp.binding.Systems;
import com.example.gofp.head_first.sol.creational.abstract_factory.classes.PizzaStore;
import com.example.gofp.head_first.sol.creational.abstract_factory.classes.factory.ChicagoPizzaStore;
import com.example.gofp.head_first.sol.creational.abstract_factory.classes.factory.NYPizzaStore;
import com.example.gofp.head_first.sol.creational.abstract_factory.classes.pizza.Pizza;
import com.example.gofp.binding.BasePattern;

public class AbstractFactory extends BasePattern {
    @Override
    public void main() {
        PizzaStore store = new NYPizzaStore();
        Pizza pizza  = store.orderPizza("cheese");
        Systems.out.println("Pizza: "+pizza);
        pizza  = store.orderPizza("veggie");
        Systems.out.println("Pizza: "+pizza);


        Systems.out.println(new ChicagoPizzaStore().orderPizza("cheese"));
        Systems.out.println(new ChicagoPizzaStore().orderPizza("veggie").toString());
    }
}
