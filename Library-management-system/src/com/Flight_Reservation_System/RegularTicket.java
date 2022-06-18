package com.Flight_Reservation_System;

import java.time.LocalDateTime;

public class RegularTicket extends Ticket {
    // Attributes

    private String specialServices;

    // Constructors

    public RegularTicket(String pnr, String from, String to, String departureDateTime,
                         String arrivalDateTime, String seatNo, float price, boolean cancelled,
                         Flight flight, Passenger passenger, String specialServices) {
        super(pnr, from, to, departureDateTime, arrivalDateTime, seatNo, price, cancelled,
                flight, passenger);
        this.specialServices = specialServices;
    }

    // Methods

    public String getSpecialServices() {
        return specialServices;
    }

    public void setSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }
}
