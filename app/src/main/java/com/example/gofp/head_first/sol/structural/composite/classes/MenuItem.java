package com.example.gofp.head_first.sol.structural.composite.classes;

import com.example.gofp.binding.Systems;

import java.util.Iterator;
import java.util.Locale;

public class MenuItem extends Component {
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        if (isVegetarian()) {
            sb.append("(v)");
        }
        sb.append(", ")
                .append(String.format(Locale.ENGLISH, "%.2f", price))
                .append(Systems.out.lineSeparator())
                .append("   -- ")
                .append(description);
        Systems.out.println(sb);
    }

    @Override
    public Iterator<Component> createIterator() {
        throw new UnsupportedOperationException();         // пустой итератор
    }

}
