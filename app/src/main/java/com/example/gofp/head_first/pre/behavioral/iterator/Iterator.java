package com.example.gofp.head_first.pre.behavioral.iterator;

import com.example.gofp.binding.BasePattern;
import com.example.gofp.binding.Systems;
import com.example.gofp.head_first.pre.behavioral.iterator.classes.DinnerMenu;
import com.example.gofp.head_first.pre.behavioral.iterator.classes.PancakeHouseMenu;
import com.example.gofp.head_first.pre.behavioral.iterator.classes.WaitressImpl;

public class Iterator extends BasePattern {
    @Override
    public void main() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinnerMenu dinnerMenu = new DinnerMenu();

        WaitressImpl waitress = new WaitressImpl(pancakeHouseMenu, dinnerMenu);
        waitress.printMenu();

        Systems.out.println();
        waitress.printBreakfastMenu();

        Systems.out.println();
        waitress.printLunchMenu();

        Systems.out.println();
        waitress.printVegetarianMenu();

    }
}
