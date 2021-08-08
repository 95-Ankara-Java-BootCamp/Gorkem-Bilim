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
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "movie_name", nullable = false, length = 128)
    private String movieName;

    @ManyToOne
    @JoinColumn(name = "movie_category_id")
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private MovieCategory movieCategory;

    @OneToOne(mappedBy = "movie")
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private Ticket ticket;
}

