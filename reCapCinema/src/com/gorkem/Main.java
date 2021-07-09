package com.gorkem;

import com.gorkem.concretes.Movie;
import com.gorkem.concretes.MovieTheater;
import com.gorkem.concretes.Ticket;
import com.gorkem.concretes.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<MovieTheater> theaters = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //In Memory
        theaters.add(new MovieTheater("Salon 1", new Movie("American Beauty", "Sam Mendes", "1999", 8.3, "Dram")));
        theaters.add(new MovieTheater("Salon 2", new Movie("Turist", "Florian Henckel von Donnersmarck", "2010", 6.0, "Aksiyon")));
        theaters.add(new MovieTheater("Salon 3", new Movie("Kadın Kokusu", "Martin Brest", "1992", 8.0, "Dram")));
        theaters.add(new MovieTheater("Salon 4", new Movie("Parçalanmış", "M. Night Shyamalan", "2016", 7.3, "Korku")));

        boolean status = true;

        while (status) {
            System.out.println("**********Kişisel bilgilerinizi doldurunuz**********");

            System.out.print("Adınız : ");
            String firstName = scanner.nextLine();

            System.out.print("Soyadınız : ");
            String lastName = scanner.nextLine();

            System.out.print("Cinsiyetiniz : ");
            String gender = scanner.nextLine();

            System.out.print("Yaşınız : ");
            int age = scanner.nextInt();

            boolean value = checkAge(age);

            if (value) {

                User user = new User(firstName, lastName, gender, age);

                showTheaterDetails();

                System.out.print("Lütfen bir salon numarası giriniz : ");
                int theaterNumber = scanner.nextInt();
                //Dummy
                scanner.nextLine();

                Ticket checkingTicket = selectTheater(new Ticket(user, LocalDate.now()), theaterNumber);

                if (checkingTicket != null) {
                    Ticket ticket = calculateTicketPriceForAge(age, checkingTicket);

                    showMovieTimes();

                    System.out.print("Bir seans seçiniz : ");
                    String movieTime = scanner.nextLine();

                    ticket.setMovieTime(movieTime);

                    System.out.println("Biletiniz ayrılmıştır iyi günler dileriz...");
                    showTicketDetails(ticket);

                    status = false;
                } else {
                    System.out.println("Geçersiz salon numarası");
                    return;
                }
            } else {
                System.out.println("Yaşınız sinema için uygun değildir");
                return;
            }
        }
    }

    public static void showTheaterDetails() {
        for (MovieTheater movieTheater : theaters) {
            System.out.println("Salon Adı : " + movieTheater.getTheaterNumber() + "\n"
                    + "**********Film Detayı**********" + "\n"
                    + "Film Adı : " + movieTheater.getMovie().getMovieName() + "\n"
                    + "Kategori : " + movieTheater.getMovie().getCategoryName() + "\n"
                    + "Yönetmen : " + movieTheater.getMovie().getDirector() + "\n"
                    + "Çıkış Tarihi : " + movieTheater.getMovie().getReleaseYear() + "\n"
                    + "Imdb Puanı : " + movieTheater.getMovie().getImdbScore() + "\n");
        }
    }

    public static void showMovieTimes() {
        System.out.println("**********Seans Saatleri**********" + "\n"
                + "13:00---15:30---17:00" + "\n"
                + "19:30---21:00---23:30" + "\n");
    }

    public static void showTicketDetails(Ticket ticket) {
        System.out.println("Bilet Numarası : " + ticket.getTicketNumber() + "\n"
                + "Ad : " + ticket.getUser().getFirstName() + " " + "Soyad : " + ticket.getUser().getLastName() + "\n"
                + "Film Adı : " + ticket.getMovie().getMovieName() + "\n"
                + "Film Kategori : " + ticket.getMovie().getCategoryName() + "\n"
                + "Salon Numarası : " + ticket.getMovieTheater().getTheaterNumber() + "\n"
                + "Koltuk Numarası : " + ticket.getSeatNumber() + "\n"
                + "Tarih : " + ticket.getTicketDate() + " " + "Seans : " + ticket.getMovieTime() + "\n"
                + "Bilet Fiyatı : " + ticket.getPrice() + " TL");
    }

    public static boolean checkAge(int age) {
        return age >= 12;
    }

    public static Ticket calculateTicketPriceForAge(int age, Ticket ticket) {
        if (age <= 18 && age >= 12) {
            ticket.setPrice((ticket.getPrice() - (ticket.getPrice() / 10)));
        } else if (age > 18 && age <= 25) {
            ticket.setPrice((ticket.getPrice() - (ticket.getPrice() / 20)));
        }
        return ticket;
    }

    public static Ticket calculateHorrorSale(Ticket ticket) {
        ticket.setPrice((ticket.getPrice() - (ticket.getPrice() / 10)));
        return ticket;
    }

    public static Ticket selectTheater(Ticket ticket, int numberOfTheater) {

        if (numberOfTheater == 1) {

            ticket.setMovie(theaters.get(0).getMovie());
            ticket.setMovieTheater(theaters.get(0));

            return ticket;

        } else if (numberOfTheater == 2) {

            ticket.setMovie(theaters.get(1).getMovie());
            ticket.setMovieTheater(theaters.get(1));

            return ticket;

        } else if (numberOfTheater == 3) {

            ticket.setMovie(theaters.get(2).getMovie());
            ticket.setMovieTheater(theaters.get(2));

            return ticket;

        } else if (numberOfTheater == 4) {

            ticket.setMovie(theaters.get(3).getMovie());
            ticket.setMovieTheater(theaters.get(3));

            return calculateHorrorSale(ticket);
        } else {
            return null;
        }
    }
}
