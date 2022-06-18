package com.Flight_Reservation_System;

public class Main {

    public static void main(String[] args) {
        // 2 Bookings, 1 domestic & 1 international
        Ticket regularTicket = new RegularTicket("39700", "Nashik",
                "Delhi", "DepartureDateTime", "ArrivalDateTime",
                "27D", 3000, false, null, null, "Non-Veg Lunch");

        Ticket touristTicket = new TouristTicket("10239", "India", "Spain",
                "DepartureDateTime", "ArrivalDateTIme",
                "9E", 90000, false, null, null,
                "Dubai Hotel", new String[]{""});
         // Prints PRN of flights
        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
    }

    public static void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPnr());
    }

}

