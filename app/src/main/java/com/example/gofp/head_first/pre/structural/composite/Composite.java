package com.example.gofp.head_first.pre.structural.composite;

import com.example.gofp.binding.BasePattern;
import com.example.gofp.head_first.pre.structural.composite.classes.CafeMenu;
import com.example.gofp.head_first.pre.structural.composite.classes.DinnerMenu;
import com.example.gofp.head_first.pre.structural.composite.classes.Menu;
import com.example.gofp.head_first.pre.structural.composite.classes.PancakeHouseMenu;
import com.example.gofp.head_first.pre.structural.composite.classes.Waitress;
import com.example.gofp.head_first.pre.structural.composite.classes.WaitressImpl;

import java.util.Arrays;
import java.util.List;

public class Composite extends BasePattern {
    @Override
    public void main() {
        List<Menu> menus = Arrays.asList(new PancakeHouseMenu(), new DinnerMenu(), new CafeMenu());
        Waitress waitress = new WaitressImpl(menus);
        waitress.printMenu();
        waitress.printBreakfastMenu();
        waitress.printLunchMenu();
        waitress.printVegetarianMenu();
    }
}
