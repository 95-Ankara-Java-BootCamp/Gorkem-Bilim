package com.gorkem.cinemademo.dataAccess;

import com.gorkem.cinemademo.entities.MovieCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieCategoryDao extends JpaRepository<MovieCategory, Integer> {
}
