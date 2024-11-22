package com.booking.bookingsystem.models.rooms;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "participants")
public class participant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

}
