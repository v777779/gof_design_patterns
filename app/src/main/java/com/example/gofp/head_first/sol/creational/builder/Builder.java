package com.example.gofp.head_first.sol.creational.builder;

import com.example.gofp.binding.BasePattern;
import com.example.gofp.binding.Systems;
import com.example.gofp.head_first.sol.creational.builder.classes.AbstractBuilder;
import com.example.gofp.head_first.sol.creational.builder.classes.Vacation;
import com.example.gofp.head_first.sol.creational.builder.classes.VacationBuilder;
import com.example.gofp.head_first.sol.creational.builder.custom.Person;

import java.util.Arrays;

public class Builder extends BasePattern {
    @Override
    public void main() {
        AbstractBuilder builder = new VacationBuilder();
        builder.buildDay(1);
        builder.addHotel("Five Stars Hotel");
        builder.addReservation("Room reservation");
        builder.addTickets(Arrays.asList("Fly TIcket #1","Fly Ticket #2"));

        Vacation day1 = builder.getVacationPlanner();
        builder = new VacationBuilder();
        builder.buildDay(2);
        builder.addHotel("Four Stars Hotel");
        builder.addReservation("Open air reservation");
        builder.addTickets(Arrays.asList("Fly TIcket #3","Fly Ticket #4"));

        Vacation day2 = builder.getVacationPlanner();

        Systems.out.println(day1);
        Systems.out.println(day2);

// custom
        Systems.out.println("Custom Builder Implementation: ");
        Systems.out.println("------------------------------");
        Person person = new Person.Builder()
                .first("Mike")
                .last("Stone")
                .age(25)
                .salary(6500.12)
                .rating(5.1)
                .build();

        Systems.out.println(person);


    }
}
