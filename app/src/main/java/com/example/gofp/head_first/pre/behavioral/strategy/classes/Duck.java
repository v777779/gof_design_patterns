package com.example.gofp.head_first.pre.behavioral.strategy.classes;

import androidx.annotation.NonNull;

import com.example.gofp.binding.Systems;

public abstract class Duck {
    protected String name;

    public Duck() {
        this.name = getClass().getSimpleName()+" ";
    }



    public void display(){
        Systems.out.println(name);
    }

    @NonNull
    @Override
    public String toString() {
        return "Duck " +name;
    }
}
