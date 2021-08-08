package com.gorkem.cinemademo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tickets")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", insertable = false, updatable = false)
    @NotFound(action = NotFoundAction.IGNORE)
    private User user;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cinema_id", referencedColumnName = "id",insertable = false,updatable = false)
    @NotFound(action = NotFoundAction.IGNORE)
    private Cinema cinema;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "movie_id", referencedColumnName = "id",insertable = false,updatable = false)
    @NotFound(action = NotFoundAction.IGNORE)
    private Movie movie;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "movie_category_id", referencedColumnName = "id",insertable = false,updatable = false)
    @NotFound(action = NotFoundAction.IGNORE)
    private MovieCategory movieCategory;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "movie_theater_id", referencedColumnName = "id",insertable = false,updatable = false)
    @NotFound(action = NotFoundAction.IGNORE)
    private MovieTheater movieTheater;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "session_id", referencedColumnName = "id",insertable = false,updatable = false)
    @NotFound(action = NotFoundAction.IGNORE)
    private Session session;
}

