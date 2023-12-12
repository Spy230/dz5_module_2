package com.msaggik.myapplication.entity;

import java.util.Date;

public class TicketChild extends Ticket {

    private float ChilDdiscount;

    public TicketChild(int id, float ticketPrice, int numberOfTickets, float discount, Date departureTime) {
        super(id, ticketPrice, numberOfTickets, departureTime);
        this.ChilDdiscount = discount;
    }

    public float getDiscount() {
        return ChilDdiscount;
    }

    public void setDiscount(float discount) {
        this.ChilDdiscount = discount;
    }

    @Override
    public float ticketPriceAll() {
        return (1 - ChilDdiscount / 100) * super.ticketPriceAll();
    }
}