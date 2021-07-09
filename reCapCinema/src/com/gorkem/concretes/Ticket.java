package com.gorkem.concretes;

import com.gorkem.abstracts.Entity;

import java.time.LocalDate;

public class Ticket implements Entity {

    private int ticketNumber = 154231;
    private User user;
    private Movie movie;
    private MovieTheater movieTheater;
    //Default seat number
    private String seatNumber = "B12";
    private LocalDate ticketDate;
    private String movieTime;
    //Fixed price
    private double price = 40d;


    public Ticket(User user, LocalDate ticketDate) {
        ticketNumber += 1;
        this.user = user;
        this.ticketDate = ticketDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public MovieTheater getMovieTheater() {
        return movieTheater;
    }

    public void setMovieTheater(MovieTheater movieTheater) {
        this.movieTheater = movieTheater;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public LocalDate getTicketDate() {
        return ticketDate;
    }

    public void setTicketDate(LocalDate ticketDate) {
        this.ticketDate = ticketDate;
    }

    public String getMovieTime() {
        return movieTime;
    }

    public void setMovieTime(String movieTime) {
        this.movieTime = movieTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //Read only
    public int getTicketNumber() {
        return ticketNumber;
    }
}
