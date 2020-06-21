package com.example.gofp.head_first.pre.behavioral.iterator.classes;

import com.example.gofp.binding.Systems;

import java.util.List;

public class WaitressImpl implements Waitress {
    private PancakeHouseMenu pancakeHouseMenu;
    private DinnerMenu dinnerMenu;

    public WaitressImpl(PancakeHouseMenu pancakeHouseMenu, DinnerMenu dinnerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
    }

    @Override
    public void printMenu() {
        Systems.out.println("MENU");
        Systems.out.println("----------------");
        List<MenuItem> list = pancakeHouseMenu.getMenuItems();
        for (int i = 0; i < list.size(); i++) {
            MenuItem item = list.get(i);
            Systems.out.println(item);
        }
        MenuItem[] array = dinnerMenu.getMenuItems();
        for (int i = 0; i < array.length; i++) {
            MenuItem item = array[i];
            Systems.out.println(item);
        }
    }

    @Override
    public void printBreakfastMenu() {
        Systems.out.println("BREAKFAST");
        Systems.out.println("----------------");
        List<MenuItem> list = pancakeHouseMenu.getMenuItems();
        for (int i = 0; i < list.size(); i++) {
            MenuItem item = list.get(i);
            Systems.out.println(item.toString());
        }
    }

    @Override
    public void printLunchMenu() {
        Systems.out.println("LUNCH");
        Systems.out.println("----------------");
        MenuItem[] array = dinnerMenu.getMenuItems();
        for (int i = 0; i < array.length; i++) {
            MenuItem item = array[i];
            Systems.out.println(item);
        }
    }

    @Override
    public void printVegetarianMenu() {
        Systems.out.println("VEGETARIAN");
        Systems.out.println("----------------");
        List<MenuItem> list = pancakeHouseMenu.getMenuItems();
        for (int i = 0; i < list.size(); i++) {
            MenuItem item = list.get(i);
            if (isItemVegetarian(item)) {
                Systems.out.println(item);
            }
        }

        MenuItem[] array = dinnerMenu.getMenuItems();
        for (int i = 0; i < array.length; i++) {
            MenuItem item = array[i];
            if (isItemVegetarian(item)) {
                Systems.out.println(item);
            }

        }
    }

    @Override
    public boolean isItemVegetarian(MenuItem item) {
        return item.isVegetarian();
    }
}
