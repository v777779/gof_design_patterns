package com.example.gofp.head_first.sol.structural.composite.classes;

import java.util.Iterator;

/**
 * Abstract class because not all methods used in children
 */
public abstract class Component {

// hierarchy        one responsibility

    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    public Component getChild(int index) {
        throw new UnsupportedOperationException();
    }

// properties       another responsibility violates S principe

    public abstract String getName() ;

    public abstract String getDescription();

    public abstract void print();

    public abstract Iterator<Component> createIterator();

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }


}
