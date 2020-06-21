package com.example.gofp.head_first.sol.behavioral.iterator.classes;

import java.util.Iterator;

public class DinnerMenuIterator implements Iterator<MenuItem> {
    private MenuItem[] menuItems;
    private int pos;

    public DinnerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
        this.pos = 0;
    }

    @Override
    public boolean hasNext() {
        return !(pos >= menuItems.length || menuItems[pos] == null);
    }

    @Override
    public MenuItem next() {
        MenuItem item = menuItems[pos];
        pos++;
        return item;
    }
}
