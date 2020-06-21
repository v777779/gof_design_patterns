package com.example.gofp.head_first.sol.behavioral.visitor.classes;

public class MenuVisitor implements MVisitor {
    private double healthRating;
    private double calories;
    private double protein;
    private double carbs;

    @Override
    public void visit(MenuItem item) {
        healthRating += item.getHealthRating();
    }

    @Override
    public void visit(Menu menu) {
//       healthRating = menu.getHealthRating();
    }

    @Override
    public void visit(Ingredient ingredient) {
        protein += ingredient.getProtein()*ingredient.getAmount()/100;
        carbs += ingredient.getCarbs()*ingredient.getAmount()/100;
        calories += ingredient.getCalories()*ingredient.getAmount()/100;
    }

    public double getHealthRating() {
        return healthRating;
    }

    public double getCalories() {
        return calories;
    }

    public double getProtein() {
        return protein;
    }

    public double getCarbs() {
        return carbs;
    }

}
