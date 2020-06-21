package com.example.gofp.head_first.pre.creational.factory_method.classes;

import com.example.gofp.binding.Systems;

import java.util.ArrayList;

public abstract class Pizza {

    protected String name;
    protected  String dough;
    protected  String sauce;
    protected ArrayList<String> toppings;

    public Pizza() {
    this.toppings = new ArrayList<>();
    }

    public void prepare(){
        Systems.out.println("Preparing "+name);
        Systems.out.println("Tossing "+dough+"...");
        Systems.out.println("Adding "+sauce+"...");
        Systems.out.println("Adding toppings: ");
        for (String topping : toppings) {
            Systems.out.println(" - "+topping);
        }
    }

    public void bake(){
        Systems.out.println("Bake for 25 minutes at 350C");
    }
    public void cut(){
        Systems.out.println("Cutting the pizza into diagonal slices");
    }
    public void box(){
        Systems.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
