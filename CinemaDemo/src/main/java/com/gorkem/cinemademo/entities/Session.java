package com.gorkem.cinemademo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sessions")
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "session_time")
    private LocalDate sessionTime;

    @Column(name = "is_active")
    private boolean isActive;

    @OneToOne(mappedBy = "session")
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private Ticket ticket;
}
