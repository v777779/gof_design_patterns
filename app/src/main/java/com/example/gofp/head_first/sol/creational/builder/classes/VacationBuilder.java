package com.example.gofp.head_first.sol.creational.builder.classes;

import java.util.List;

public class VacationBuilder extends AbstractBuilder {
    private Vacation vacation;

    public VacationBuilder() {
        this.vacation = new Vacation();
    }

    @Override
    public void buildDay(int day) {
        vacation.setDay(day);
    }

    @Override
    public void addHotel(String hotel) {
        vacation.setHotel(hotel);
    }

    @Override
    public void addReservation(String reservation) {
        vacation.setReservation(reservation);
    }

    @Override
    public void addTickets(List<String> tickets) {
        vacation.setTickets(tickets);
    }

    @Override
    public Vacation getVacationPlanner() {
        return vacation;
    }
}
