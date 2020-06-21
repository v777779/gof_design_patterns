package com.example.gofp.head_first.sol.structural.composite.classes;

import com.example.gofp.binding.Systems;

import java.util.Iterator;

public class WaitressImpl implements Waitress {
    private Component menus;

    public WaitressImpl(Component menus) {
        this.menus = menus;
    }

    @Override
    public void printMenu() {
        menus.print();
    }

    @Override
    public void printBreakfastMenu() {
//        menus.get(0).print();
    }

    @Override
    public void printLunchMenu() {
//        menus.get(1).print();
    }

    @Override
    public void printVegetarianMenu() {
        Iterator<Component> iterator = menus.createIterator();
        Systems.out.println();
        Systems.out.println("VEGETARIAN MENU");
        Systems.out.println("----------------------");
        recursive(iterator);

    }

    private void recursive(Iterator<Component> iterator){
        while (iterator.hasNext()){
            Component component = iterator.next();
            if(component instanceof Menu) {
                recursive(component.createIterator());
            }else {
                if (component.isVegetarian()) {
                    component.print();
                }
            }
        }
    }


}
