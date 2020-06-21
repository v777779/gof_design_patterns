package com.example.gofp.head_first.pre.behavioral.template_method;

import com.example.gofp.binding.BasePattern;
import com.example.gofp.binding.Systems;
import com.example.gofp.head_first.pre.behavioral.template_method.classes.Coffee;
import com.example.gofp.head_first.pre.behavioral.template_method.classes.Tea;

public class TemplateMethod extends BasePattern {
    @Override
    public void main() {
        Coffee coffee = new Coffee();
        Tea tea = new Tea();

        coffee.prepareRecipe();

        Systems.out.println();

        tea.prepareRecipe();
    }
}
