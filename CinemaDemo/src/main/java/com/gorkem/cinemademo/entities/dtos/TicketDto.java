package com.gorkem.cinemademo.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketDto {

    private int userId;
    private String cinemaName;
    private String movieName;
    private String categoryName;
    private String theaterNumber;
    private LocalDate sessionTime;
}
