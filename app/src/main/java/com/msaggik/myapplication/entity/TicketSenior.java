package com.msaggik.myapplication.entity;

import java.util.Date;

public class TicketSenior extends Ticket {

    private float seniorDiscount;

    public TicketSenior(int id, float ticketPrice, int numberOfTickets, float seniorDiscount, Date departureTime) {
        super(id, ticketPrice, numberOfTickets, departureTime);
        this.seniorDiscount = seniorDiscount;
    }

    public float getSeniorDiscount() {
        return seniorDiscount;
    }

    public void setSeniorDiscount(float seniorDiscount) {
        this.seniorDiscount = seniorDiscount;
    }

    @Override
    public float ticketPriceAll() {
        return (1 - seniorDiscount / 100) * super.ticketPriceAll();
    }
}