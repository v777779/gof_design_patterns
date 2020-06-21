package com.example.gofp.head_first.sol.structural.composite.classes;

import com.example.gofp.binding.Systems;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends Component {
    protected List<Component> components;
    protected String name;
    protected String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
        this.components = new ArrayList<>();

    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public Component getChild(int index) {
        return components.get(index);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void print() {

        String sb = Systems.out.lineSeparator() +
                name + ", " +
                description +
                Systems.out.lineSeparator() +
                "----------------------";
        Systems.out.println(sb);
        Iterator<Component> iterator = createIterator();
        while (iterator.hasNext()) {
            Component component = iterator.next();
            component.print();
        }
    }

    @Override
    public Iterator<Component> createIterator() {
        return components.iterator();  // передали свой List<>.iterator()
    }

}
