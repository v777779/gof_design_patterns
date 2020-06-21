package com.example.gofp.head_first.pre.structural.composite.classes;

import com.example.gofp.binding.Systems;

import java.util.Iterator;
import java.util.List;

public class WaitressImpl implements Waitress {
    private List<Menu> menus;

    public WaitressImpl(List<Menu> menus) {
        this.menus = menus;
    }

    @Override
    public void printMenu() {
        Systems.out.println("MENU");
        Systems.out.println("-------------------");
        for (Menu menu : menus) {
            Iterator<MenuItem> iterator = menu.iterator();
            while (iterator.hasNext()) {
                MenuItem item = iterator.next();
                Systems.out.println(item);
            }
        }
    }

    @Override
    public void printBreakfastMenu() {
        Systems.out.println();
        Systems.out.println("BREAKFAST");
        Systems.out.println("-------------------");
        Iterator<MenuItem> iterator = menus.get(0).iterator();
        while (iterator.hasNext()) {
            MenuItem item = iterator.next();
            Systems.out.println(item.toString());
        }
    }

    @Override
    public void printLunchMenu() {
        Systems.out.println();
        Systems.out.println("LUNCH");
        Systems.out.println("-------------------");
        Iterator<MenuItem> iterator = menus.get(1).iterator();
        while (iterator.hasNext()) {
            MenuItem item = iterator.next();
            Systems.out.println(item);
        }

    }

    @Override
    public void printVegetarianMenu() {
        Systems.out.println();
        Systems.out.println("VEGETARIAN");
        Systems.out.println("-------------------");
        for (Menu menu : menus) {
            Iterator<MenuItem> iterator = menu.iterator();
            while (iterator.hasNext()) {
                MenuItem item = iterator.next();
                if (item.isVegetarian()) {
                    Systems.out.println(item.toString());
                }
            }
        }
    }


}
