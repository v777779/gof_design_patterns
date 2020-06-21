package com.example.gofp.head_first.pre.behavioral.visitor;

import com.example.gofp.binding.BasePattern;
import com.example.gofp.binding.Systems;
import com.example.gofp.head_first.pre.behavioral.visitor.classes.Ingredient;
import com.example.gofp.head_first.pre.behavioral.visitor.classes.Menu;
import com.example.gofp.head_first.pre.behavioral.visitor.classes.MenuItem;
import com.example.gofp.head_first.pre.behavioral.visitor.classes.ingredients.MenuCreator;

import java.util.Locale;


public class Visitor extends BasePattern {
    @Override
    public void main() {
        MenuCreator creator = new MenuCreator();
        Menu dinner = creator.getDinner();

        double healthRating = dinner.getHealthRating();
        double calories = 0;
        double protein = 0;
        double carbs = 0;;

        for (MenuItem item : dinner.getItems()) {
            for (Ingredient ingredient : item.getIngredients()) {
                calories +=ingredient.getCalories()*ingredient.getAmount()/100;
                protein +=ingredient.getProtein()*ingredient.getAmount()/100;
                carbs +=ingredient.getCarbs()*ingredient.getAmount()/100;
            }
        }
        Systems.out.println(dinner);
        Systems.out.println(String.format(Locale.ENGLISH,"Health Rating: %.1f",healthRating));
        Systems.out.println(String.format(Locale.ENGLISH,"Calories: %.1f",calories));
        Systems.out.println(String.format(Locale.ENGLISH,"Protein: %.1f",protein));
        Systems.out.println(String.format(Locale.ENGLISH,"Carbs: %.1f",carbs));

    }
}
