package com.example.gofp.head_first.sol.behavioral.iterator.classes;

import com.example.gofp.binding.Systems;

import java.util.Iterator;

public class WaitressImpl implements Waitress {
    private Menu pancakeHouseMenu;
    private Menu dinnerMenu;
    private Menu cafeMenu;

    public WaitressImpl(Menu pancakeHouseMenu, Menu dinnerMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
        this.cafeMenu = cafeMenu;
    }

    private void outputVegetarian(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem item = iterator.next();
            if (isItemVegetarian(item)) {
                Systems.out.println(item);
            }
        }
    }

    private void output(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem item = iterator.next();
            Systems.out.println(item);
        }
    }

    @Override
    public void printMenu() {
        Systems.out.println("MENU");
        Systems.out.println("---------------------");
        output(pancakeHouseMenu.iterator());
        output(dinnerMenu.iterator());
        output(cafeMenu.iterator());
        Systems.out.println();
    }

    @Override
    public void printBreakfastMenu() {
        Systems.out.println("BREAKFAST");
        Systems.out.println("---------------------");
        output(pancakeHouseMenu.iterator());
        Systems.out.println();
    }

    @Override
    public void printLunchMenu() {
        Systems.out.println("LUNCH");
        Systems.out.println("---------------------");
        output(dinnerMenu.iterator());
        Systems.out.println();
    }

    @Override
    public void printVegetarianMenu() {
        Systems.out.println("VEGETARIAN");
        Systems.out.println("---------------------");
        outputVegetarian(pancakeHouseMenu.iterator());
        outputVegetarian(dinnerMenu.iterator());
        outputVegetarian(cafeMenu.iterator());
        Systems.out.println();
    }

    @Override
    public boolean isItemVegetarian(MenuItem item) {
        return item.isVegetarian();
    }

}
