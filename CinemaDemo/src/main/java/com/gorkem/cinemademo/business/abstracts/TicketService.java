package com.gorkem.cinemademo.business.abstracts;

import com.gorkem.cinemademo.core.results.Result;
import com.gorkem.cinemademo.entities.dtos.TicketDto;

public interface TicketService {

    Result add(TicketDto ticketDto);
}
