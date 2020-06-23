package com.example.gofp.head_first.sol.structural.flyweight.custom;

import com.example.gofp.binding.Systems;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class FlowerManager {
    private static final int MAX_FLOWERS = 10;
    private static final String[] NAMES = {
            "Rose   ", "Lotus  ", "Poppy ", "Cherry", "Daisy  "};
    private final Random rand;
    private FlyweightFactory factory;
    private final List<Flower> flowers;

    public FlowerManager(FlyweightFactory factory) {
        this.factory = factory;
        this.rand = new Random(System.currentTimeMillis());
        this.flowers = new ArrayList<>();


        initialize();
    }

    public void initialize() {
        for (int i = 0; i < MAX_FLOWERS; i++) {
            String randomName = NAMES[rand.nextInt(NAMES.length)];
            Flower flyweight = factory.getFlyweight(randomName);
            int x = rand.nextInt(75);
            int y = rand.nextInt(75);

            FlowerImpl flower = new FlowerImpl(flyweight, x, y);
            flowers.add(flower);
        }

    }

    public void displayFlowers() {
        for (Flower flower : flowers) {
            Systems.out.println(flower.display());
        }
    }

}