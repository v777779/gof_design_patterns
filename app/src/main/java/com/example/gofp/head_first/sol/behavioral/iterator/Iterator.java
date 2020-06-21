package com.example.gofp.head_first.sol.behavioral.iterator;

import com.example.gofp.binding.BasePattern;
import com.example.gofp.head_first.sol.behavioral.iterator.classes.CafeMenu;
import com.example.gofp.head_first.sol.behavioral.iterator.classes.DinnerMenu;
import com.example.gofp.head_first.sol.behavioral.iterator.classes.Menu;
import com.example.gofp.head_first.sol.behavioral.iterator.classes.PancakeHouseMenu;
import com.example.gofp.head_first.sol.behavioral.iterator.classes.WaitressImpl;

public class Iterator extends BasePattern {
    @Override
    public void main() {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinnerMenu = new DinnerMenu();
        Menu cafeMenu = new CafeMenu();


        WaitressImpl waitress = new WaitressImpl(pancakeHouseMenu, dinnerMenu, cafeMenu);
        waitress.printMenu();
        waitress.printBreakfastMenu();
        waitress.printLunchMenu();
        waitress.printVegetarianMenu();
    }
}
