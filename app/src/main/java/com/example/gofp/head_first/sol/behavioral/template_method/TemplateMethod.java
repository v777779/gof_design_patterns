package com.example.gofp.head_first.sol.behavioral.template_method;

import com.example.gofp.binding.BasePattern;
import com.example.gofp.binding.Systems;
import com.example.gofp.head_first.sol.behavioral.template_method.classes.Coffee;
import com.example.gofp.head_first.sol.behavioral.template_method.classes.Tea;

public class TemplateMethod extends BasePattern {
    @Override
    public void main() {
        Coffee coffee = new Coffee();
        Tea tea = new Tea();
        Tea teaNoLemon = new Tea(false);

        coffee.prepareRecipe();

        Systems.out.println();
        tea.prepareRecipe();

        Systems.out.println();
        teaNoLemon.prepareRecipe();
    }
}
