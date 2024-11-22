package com.booking.bookingsystem.models.rooms;

import lombok.Data;
import java.time.LocalDateTime;
@Data
public class createRoomDTO {
    private int userId;
    private String roomPass;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
}
