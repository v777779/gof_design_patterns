package com.example.gofp.head_first.sol.structural.composite;

import com.example.gofp.binding.BasePattern;
import com.example.gofp.head_first.sol.structural.composite.classes.Component;
import com.example.gofp.head_first.sol.structural.composite.classes.Constants;
import com.example.gofp.head_first.sol.structural.composite.classes.Menu;
import com.example.gofp.head_first.sol.structural.composite.classes.MenuItem;
import com.example.gofp.head_first.sol.structural.composite.classes.Waitress;
import com.example.gofp.head_first.sol.structural.composite.classes.WaitressImpl;

public class Composite extends BasePattern {
    @Override
    public void main() {
        Component menu = new Menu(Constants.AllMenus.TITLE,Constants.AllMenus.DESCRIPTION);

        Component pancake = new Menu(Constants.Pancake.TITLE,Constants.Pancake.DESCRIPTION);
        Component dinner = new Menu(Constants.Dinner.TITLE,Constants.Dinner.DESCRIPTION);
        Component cafe= new Menu(Constants.Cafe.TITLE,Constants.Cafe.DESCRIPTION);
        Component dessert= new Menu(Constants.Dessert.TITLE,Constants.Dessert.DESCRIPTION);

        menu.add(pancake);      // sub menu level 1
        for (MenuItem item : Constants.Pancake.get()) {
            pancake.add(item);
        }

// order MUST HAVE
        menu.add(dinner);
        for (MenuItem item : Constants.Dinner.get()) {
            dinner.add(item);
        }
        dinner.add(dessert);    // sub menu level 2
        for (MenuItem item : Constants.Dessert.get()) {
            dessert.add(item);
        }

        menu.add(cafe);
        for (MenuItem item : Constants.Cafe.get()) {
            cafe.add(item);
        }

        Waitress waitress = new WaitressImpl(menu);
        waitress.printMenu();
        waitress.printVegetarianMenu();
    }
}
