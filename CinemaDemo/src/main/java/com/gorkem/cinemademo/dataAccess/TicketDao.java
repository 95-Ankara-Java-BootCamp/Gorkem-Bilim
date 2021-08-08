package com.gorkem.cinemademo.dataAccess;

import com.gorkem.cinemademo.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketDao extends JpaRepository<Ticket, Integer> {
}
