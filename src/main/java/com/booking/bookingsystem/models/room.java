package com.booking.bookingsystem.models;
import jakarta.persistence.*;

@Entity
@Table(name = "rooms")
public class room{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
}