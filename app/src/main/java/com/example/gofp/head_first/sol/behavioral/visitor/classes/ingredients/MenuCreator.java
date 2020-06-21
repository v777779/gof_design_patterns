package com.example.gofp.head_first.sol.behavioral.visitor.classes.ingredients;

import com.example.gofp.head_first.sol.behavioral.visitor.classes.Menu;
import com.example.gofp.head_first.sol.behavioral.visitor.classes.MenuItem;

public class MenuCreator {

    public MenuItem getPorridge(){
        MenuItem item = new MenuItem("Rice porridge","Rice porridge with butter", 1.25);
        item.add(new Rice(100));
        item.add(new Milk(500));
        item.add(new Butter(20));
        return item;
    }

    public MenuItem getBeef(){
        MenuItem item = new MenuItem("Beef with rice","Beef with rice and vegetables", 4.25);
        item.add(new Beef(100));
        item.add(new Rice(100));
        item.add(new MixedVegetables(300));
        item.add(new Butter(20));
        return item;
    }

    public MenuItem getFish(){
        MenuItem item = new MenuItem("Fish with rice","Fish with rice and vegetables", 3.25);
        item.add(new Fish(100));
        item.add(new Rice(100));
        item.add(new MixedVegetables(300));
        return item;
    }

    public MenuItem getSoup(){
        MenuItem item = new MenuItem("Soup with beef","Soup wth beef and vegetables", 2.25);
        item.add(new Beef(100));
        item.add(new MixedVegetables(400));
        return item;
    }

    public MenuItem getMilk(){
        MenuItem item = new MenuItem("Milk","Glass of milk", 0.25);
        item.add(new Milk(200));
        return item;
    }

    public MenuItem getBread(){
        MenuItem item = new MenuItem("Bread","Pieces of bread", 0.15);
        item.add(new Bread(150));
        return item;
    }

    public MenuItem getButter(){
        MenuItem item = new MenuItem("Butter","Pieces of butter", 0.25);
        item.add(new Bread(20));
        return item;
    }


    public Menu getBreakfast(){
        Menu menu = new Menu("Breakfast","Vegetarian breakfast");
        menu.add(getFish());
        menu.add(getBread());
       return menu;
    }

    public Menu getLunch(){
        Menu menu = new Menu("Milk lunch","Lunch with porridge and milk");
        menu.add(getPorridge());
        menu.add(getBread());
        menu.add(getMilk());
        menu.add(getButter());
        return menu;
    }

    public Menu getDinner(){
        Menu menu = new Menu("Dinner with beef","Dinner with soup, beef and bread");
        menu.add(getSoup());
        menu.add(getBeef());
        menu.add(getBread());
        return menu;
    }

}
