package com.gorkem.concretes;

import com.gorkem.abstracts.Entity;

public class Movie implements Entity {

    private final String movieName;
    private final String categoryName;
    private final String director;
    private final String releaseYear;
    private final double imdbScore;

    public Movie(String movieName, String director, String releaseYear, double imdbScore, String categoryName) {
        this.movieName = movieName;
        this.director = director;
        this.releaseYear = releaseYear;
        this.imdbScore = imdbScore;
        this.categoryName = categoryName;
    }

    //Read only
    public String getMovieName() {
        return movieName;
    }

    public String getDirector() {
        return director;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public double getImdbScore() {
        return imdbScore;
    }

    public String getCategoryName() {
        return categoryName;
    }
}
