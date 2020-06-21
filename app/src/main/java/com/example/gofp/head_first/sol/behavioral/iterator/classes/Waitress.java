package com.example.gofp.head_first.sol.behavioral.iterator.classes;

public interface Waitress {
    void printMenu();
    void printBreakfastMenu();
    void printLunchMenu();
    void printVegetarianMenu();
    boolean isItemVegetarian(MenuItem item);
}
