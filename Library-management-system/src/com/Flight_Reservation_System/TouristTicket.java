package com.Flight_Reservation_System;

import java.time.LocalDateTime;

public class TouristTicket extends Ticket {

    // Attributes
    private String hotelAddress;
    private String[] selectedTouristLocation;


    // Constructors
    public TouristTicket(String pnr, String from, String to, String departureDateTime,
                         String arrivalDateTime, String seatNo, float price, boolean cancelled,
                         Flight flight, Passenger passenger, String hotelAddress,
                         String[] selectedTouristLocation) {
        super(pnr, from, to, departureDateTime, arrivalDateTime, seatNo, price, cancelled, flight, passenger);
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation = selectedTouristLocation;
    }


    // Methods

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String[] getSelectedTouristLocation() {
        return selectedTouristLocation;
    }

    public void setSelectedTouristLocation(String[] selectedTouristLocation) {
        this.selectedTouristLocation = selectedTouristLocation;
    }



   // Removes Tourist Location
    public void removeTouristLocation(String location) {
        int index=-1;
        for (int i=0; i<selectedTouristLocation.length; i++) {
            if (selectedTouristLocation[i].equals(location)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return;
        }
        for (int i=index; i< selectedTouristLocation.length-1; i++) {
            selectedTouristLocation[i] = selectedTouristLocation[i+1];
        }
        selectedTouristLocation[selectedTouristLocation.length-1] = null;
    }

   // Adds Tourist location

    public void addTouristLocation(String location) {
        int index = -1;
        for (int i=0; i< selectedTouristLocation.length; i++) {
            if (selectedTouristLocation[i] == null) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            selectedTouristLocation[index] = location;
        }
    }
}
