package com.gorkem.cinemademo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "movie_theaters")
public class MovieTheater {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "theater_number", nullable = false)
    private String theaterNumber;

    @Column(name = "hall_capacity", nullable = false)
    private String hallCapacity;

    @OneToOne(mappedBy = "movieTheater")
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private Ticket ticket;
}
