package com.example.gofp.head_first.sol.creational.builder.custom;

import androidx.annotation.NonNull;

import com.example.gofp.binding.Systems;

import java.util.Locale;

public class Person {
    private String first;
    private String last;
    private int age;
    private double salary;
    private double rating;

    public Person(String first, String last, int age, double salary, double rating) {
        this.first = first;
        this.last = last;
        this.age = age;
        this.salary = salary;
        this.rating = rating;
    }

    private Person(Builder builder) {
        this.first = builder.first;
        this.last = builder.last;
        this.age = builder.age;
        this.salary = builder.salary;
        this.rating = builder.rating;
    }

    // classes
    public static class Builder {
        private String first;
        private String last;
        private int age;
        private double salary;
        private double rating;

        public Builder first(String first) {
            this.first = first;
            return this;
        }

        public Builder last(String last) {
            this.last = last;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder salary(double salary) {
            this.salary = salary;
            return this;
        }

        public Builder rating(double rating) {
            this.rating = rating;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    @NonNull
    @Override
    public String toString() {
        return "Person: " + Systems.out.lineSeparator() +
                "Name: " + first + " " + last +
                Systems.out.lineSeparator() +
                "Age: " + age +
                Systems.out.lineSeparator() +
                "Salary: " + String.format(Locale.ENGLISH, "%.2f", salary) +
                Systems.out.lineSeparator() +
                "Rating: " + String.format(Locale.ENGLISH, "%.1f", rating) +
                Systems.out.lineSeparator();
    }
}
