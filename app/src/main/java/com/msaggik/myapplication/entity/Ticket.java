package com.msaggik.myapplication.entity;

import java.util.Date;

public class Ticket {
    private float discount;
    private int id;
    private float ticketPrice;
    private int numberOfTickets;
    private Date departureTime;

    public Ticket(int id, float ticketPrice, int numberOfTickets, Date departureTime) {
        this.id = id;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
        this.departureTime = departureTime;
    }

    public float ticketPriceAll() {return ticketPrice * numberOfTickets * (1 - discount / 100);
    }
}