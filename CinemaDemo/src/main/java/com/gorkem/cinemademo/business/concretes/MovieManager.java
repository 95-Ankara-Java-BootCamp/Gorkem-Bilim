package com.gorkem.cinemademo.business.concretes;

import com.gorkem.cinemademo.business.abstracts.MovieService;
import com.gorkem.cinemademo.core.results.Result;
import com.gorkem.cinemademo.core.results.SuccessResult;
import com.gorkem.cinemademo.dataAccess.MovieDao;
import com.gorkem.cinemademo.entities.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieManager implements MovieService {

    private MovieDao movieDao;

    @Autowired
    public MovieManager(MovieDao movieDao) {
        this.movieDao = movieDao;
    }

    @Override
    public Result add(Movie movie) {
        this.movieDao.save(movie);
        return new SuccessResult("Successfully Added!");
    }
}
