package com.gorkem.cinemademo.dataAccess;

import com.gorkem.cinemademo.entities.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CinemaDao extends JpaRepository<Cinema, Integer> {
}
