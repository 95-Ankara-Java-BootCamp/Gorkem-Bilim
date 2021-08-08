package com.gorkem.cinemademo.api.controllers;

import com.gorkem.cinemademo.business.abstracts.MovieCategoryService;
import com.gorkem.cinemademo.core.results.Result;
import com.gorkem.cinemademo.entities.MovieCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/movieCategories")
public class MovieCategoriesController {

    private MovieCategoryService movieCategoryService;

    @Autowired
    public MovieCategoriesController(MovieCategoryService movieCategoryService) {
        this.movieCategoryService = movieCategoryService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody MovieCategory movieCategory) {
        return this.movieCategoryService.add(movieCategory);
    }

}
