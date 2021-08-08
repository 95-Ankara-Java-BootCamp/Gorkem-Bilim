package com.gorkem.cinemademo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "movie_categories")
public class MovieCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "category_name", nullable = false, length = 128)
    private String categoryName;

    @OneToMany(mappedBy = "movieCategory")
    private List<Movie> movies;

    @OneToOne(mappedBy = "movieCategory")
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private Ticket ticket;
}
