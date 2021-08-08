package com.gorkem.cinemademo.api.controllers;

import com.gorkem.cinemademo.business.abstracts.TicketService;
import com.gorkem.cinemademo.core.results.Result;
import com.gorkem.cinemademo.entities.dtos.TicketDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tickets")
public class TicketsController {

    private TicketService ticketService;

    @Autowired
    public TicketsController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody TicketDto ticketDto) {
        return this.ticketService.add(ticketDto);
    }
}
