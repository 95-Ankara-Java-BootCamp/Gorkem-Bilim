package com.gorkem.cinemademo.dataAccess;

import com.gorkem.cinemademo.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieDao extends JpaRepository<Movie, Integer> {
}
