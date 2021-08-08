package com.gorkem.cinemademo.api.controllers;

import com.gorkem.cinemademo.business.abstracts.CinemaService;
import com.gorkem.cinemademo.core.results.Result;
import com.gorkem.cinemademo.entities.Cinema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cinemas")
public class CinemasController {

    private CinemaService cinemaService;

    @Autowired
    public CinemasController(CinemaService cinemaService) {
        this.cinemaService = cinemaService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody Cinema cinema) {
        return this.cinemaService.add(cinema);
    }
}
