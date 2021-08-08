package com.gorkem.cinemademo.business.concretes;

import com.gorkem.cinemademo.business.abstracts.TicketService;
import com.gorkem.cinemademo.core.results.Result;
import com.gorkem.cinemademo.core.results.SuccessResult;
import com.gorkem.cinemademo.dataAccess.TicketDao;
import com.gorkem.cinemademo.entities.Ticket;
import com.gorkem.cinemademo.entities.dtos.TicketDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketManager implements TicketService {

    private TicketDao ticketDao;
    private ModelMapper modelMapper;

    @Autowired
    public TicketManager(TicketDao ticketDao, ModelMapper modelMapper) {
        this.ticketDao = ticketDao;
        this.modelMapper = modelMapper;
    }

    @Override
    public Result add(TicketDto ticketDto) {
        Ticket ticket = this.modelMapper.map(ticketDto, Ticket.class);
        this.ticketDao.save(ticket);
        return new SuccessResult("Successfully Added!");
    }
}
