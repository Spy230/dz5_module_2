package com.msaggik.myapplication.entity;

import java.util.Date;

public class TicketYoungAdult extends Ticket {
    private float youngAdultDiscount;

    // youngAdultDiscount всегда равно 0
    private static final float DEFAULT_YOUNG_ADULT_DISCOUNT = 0f;

    public TicketYoungAdult(int id, float ticketPrice, int numberOfTickets, Date departureTime) {
        super(id, ticketPrice, numberOfTickets, departureTime);
        this.youngAdultDiscount = DEFAULT_YOUNG_ADULT_DISCOUNT;
    }

    @Override
    public float ticketPriceAll() {
        return super.ticketPriceAll(); // Без применения скидки
    }
}