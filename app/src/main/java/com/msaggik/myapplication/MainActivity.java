package com.msaggik.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.msaggik.myapplication.entity.Ticket;
import com.msaggik.myapplication.entity.TicketChild;
import com.msaggik.myapplication.entity.TicketSenior;
import com.msaggik.myapplication.entity.TicketYoungAdult;

import java.util.Date;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Date departureTime = new Date(2023 - 1900, 8, 7, 10, 0);
        Ticket ticket = new Ticket(1, 35, 36, departureTime);
        TicketChild ticketChild = new TicketChild(2, 35, 14, 50f, departureTime);

// Использование TicketSenior для стариков
        TicketSenior ticketSenior = new TicketSenior(3, 35, 10, 45f, departureTime);

// Использование TicketYoungAdult для   взрослых
        TicketYoungAdult ticketYoungAdult = new TicketYoungAdult(4, 35, 12,  departureTime);

        TextView infoApp = findViewById(R.id.infoApp);

        float ticketPrice = ticket.ticketPriceAll();
        float ticketPriceChild = ticketChild.ticketPriceAll();
        float ticketPriceSenior = ticketSenior.ticketPriceAll();
        float ticketPriceYoungAdult = ticketYoungAdult.ticketPriceAll();
        float ticketPriceAll =   ticketPriceChild + ticketPriceSenior + ticketPriceYoungAdult;

        infoApp.setText("Общая стоимость всех билетов: " + ticketPriceAll + " монет\n"
                + "Стоимость детских билетов: " + ticketPriceChild + " монет,"
                + "Стоимость билетов для пенсионеров: " + ticketPriceSenior + " монет\n"
                + "Стоимость билетов для молодых взрослых: " + ticketPriceYoungAdult + " монет\n"
                + "Время отправления: " + departureTime.toString());
    }
}
