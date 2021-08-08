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
@Table(name = "cinemas")
public class Cinema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "cinema_name", nullable = false, length = 128)
    private String cinemaName;

    @Column(name = "number_of_movie_theaters", nullable = false)
    private int numberOfMovieTheaters;

    @OneToOne(mappedBy = "cinema")
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private Ticket ticket;
}
