package com.example.gofp.head_first.sol.creational.builder.classes;

import java.util.List;

public abstract class AbstractBuilder {
    public abstract void buildDay(int day);

    public abstract void addHotel(String hotel);

    public abstract void addReservation(String reservation);

    public abstract void addTickets(List<String> tickets);

    public abstract Vacation getVacationPlanner();

}
