package com.gorkem.cinemademo.api.controllers;

import com.gorkem.cinemademo.business.abstracts.MovieTheaterService;
import com.gorkem.cinemademo.core.results.Result;
import com.gorkem.cinemademo.entities.MovieTheater;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/movieTheaters")
public class MovieTheatersController {

    private MovieTheaterService movieTheaterService;

    @Autowired
    public MovieTheatersController(MovieTheaterService movieTheaterService) {
        this.movieTheaterService = movieTheaterService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody MovieTheater movieTheater) {
        return this.movieTheaterService.add(movieTheater);
    }
}
