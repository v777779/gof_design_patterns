package com.example.gofp.head_first.sol.behavioral.visitor;

import com.example.gofp.binding.BasePattern;
import com.example.gofp.binding.Systems;
import com.example.gofp.head_first.sol.behavioral.visitor.classes.Menu;
import com.example.gofp.head_first.sol.behavioral.visitor.classes.MenuVisitor;
import com.example.gofp.head_first.sol.behavioral.visitor.classes.ingredients.MenuCreator;

import java.util.Locale;

public class Visitor extends BasePattern {
    @Override
    public void main() {
        MenuCreator creator = new MenuCreator();
        Menu dinner = creator.getDinner();

        MenuVisitor visitor = new MenuVisitor();
        dinner.getState(visitor);

        double healthRating = visitor.getHealthRating();
        double calories = visitor.getCalories();
        double protein = visitor.getProtein();
        double carbs = visitor.getCarbs();;

        Systems.out.println(dinner);
        Systems.out.println(String.format(Locale.ENGLISH,"Health Rating: %.1f",healthRating));
        Systems.out.println(String.format(Locale.ENGLISH,"Calories: %.1f",calories));
        Systems.out.println(String.format(Locale.ENGLISH,"Protein: %.1f",protein));
        Systems.out.println(String.format(Locale.ENGLISH,"Carbs: %.1f",carbs));

    }
}
