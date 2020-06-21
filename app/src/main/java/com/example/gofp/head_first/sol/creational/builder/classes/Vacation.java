package com.example.gofp.head_first.sol.creational.builder.classes;

import androidx.annotation.NonNull;

import com.example.gofp.binding.Systems;

import java.util.ArrayList;
import java.util.List;

public class Vacation {
    private String hotel;
    private int day;
    private String reservation;
    private String specialEvent;
    private List<String> tickets;

    public Vacation() {
        this.tickets = new ArrayList<>();
        this.day = 1;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getReservation() {
        return reservation;
    }

    public void setReservation(String reservation) {
        this.reservation = reservation;
    }

    public String getSpecialEvent() {
        return specialEvent;
    }

    public void setSpecialEvent(String specialEvent) {
        this.specialEvent = specialEvent;
    }

    public List<String> getTickets() {
        return tickets;
    }

    public void setTickets(List<String> tickets) {
        this.tickets = tickets;
    }

    @NonNull
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vacation on day: ").append(day);
        sb.append(Systems.out.lineSeparator());
        sb.append("Hotel: ").append(hotel);
        sb.append(Systems.out.lineSeparator());
        sb.append("Reservation: ").append(reservation);
        sb.append(Systems.out.lineSeparator());
        sb.append("Special event: ").append(specialEvent);
        sb.append(Systems.out.lineSeparator());
        sb.append("Tickets: ");
        for (String ticket : tickets) {
         sb.append(ticket).append(" ");
        }
        sb.append(Systems.out.lineSeparator());
        return sb.toString();
    }
}
