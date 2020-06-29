package com.example.gofp.head_first.sol.behavioral.iterator;

import com.example.gofp.binding.BasePattern;
import com.example.gofp.binding.Systems;
import com.example.gofp.head_first.sol.behavioral.iterator.classes.CafeMenu;
import com.example.gofp.head_first.sol.behavioral.iterator.classes.DinnerMenu;
import com.example.gofp.head_first.sol.behavioral.iterator.classes.Menu;
import com.example.gofp.head_first.sol.behavioral.iterator.classes.MenuItem;
import com.example.gofp.head_first.sol.behavioral.iterator.classes.PancakeHouseMenu;
import com.example.gofp.head_first.sol.behavioral.iterator.classes.WaitressImpl;
import com.example.gofp.head_first.sol.behavioral.iterator.custom.AggregateIterator;
import com.example.gofp.head_first.sol.behavioral.iterator.custom.CafeAggregate;

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



// custom

        Systems.out.println();
        Systems.out.println("CAFE AGGREGATE ITERATOR: ");
        System.out.println("------------------------");

        CafeAggregate cafe =  new CafeAggregate();
        AggregateIterator<MenuItem> iterator = cafe.iterator();

        while(iterator.hasNext()){
        MenuItem item = iterator.next();
            Systems.out.println(item);
        }

    }
}
