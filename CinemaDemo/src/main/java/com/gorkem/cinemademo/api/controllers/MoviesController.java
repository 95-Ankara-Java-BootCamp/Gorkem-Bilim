package com.gorkem.cinemademo.api.controllers;

import com.gorkem.cinemademo.business.abstracts.MovieService;
import com.gorkem.cinemademo.core.results.Result;
import com.gorkem.cinemademo.entities.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/movies")
public class MoviesController {

    private MovieService movieService;

    @Autowired
    public MoviesController(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody Movie movie) {
        return this.movieService.add(movie);
    }
}
