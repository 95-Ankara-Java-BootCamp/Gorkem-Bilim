package com.gorkem.cinemademo.dataAccess;

import com.gorkem.cinemademo.entities.MovieTheater;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieTheaterDao extends JpaRepository<MovieTheater, Integer> {
}
