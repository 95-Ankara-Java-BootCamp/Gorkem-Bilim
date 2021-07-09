package com.gorkem.concretes;

import com.gorkem.abstracts.Entity;

public class MovieTheater implements Entity {

    private final String theaterNumber;
    private final Movie movie;
    private final int theaterCapacity = 40;

    public MovieTheater(String theaterNumber, Movie movie) {
        this.theaterNumber = theaterNumber;
        this.movie = movie;
    }

    //Read only
    public String getTheaterNumber() {
        return theaterNumber;
    }

    public Movie getMovie() {
        return movie;
    }
}
