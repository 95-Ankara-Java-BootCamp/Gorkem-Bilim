package com.gorkem.cinemademo.business.concretes;

import com.gorkem.cinemademo.business.abstracts.MovieTheaterService;
import com.gorkem.cinemademo.core.results.Result;
import com.gorkem.cinemademo.core.results.SuccessResult;
import com.gorkem.cinemademo.dataAccess.MovieTheaterDao;
import com.gorkem.cinemademo.entities.MovieTheater;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieTheaterManager implements MovieTheaterService {

    private MovieTheaterDao movieTheaterDao;

    @Autowired
    public MovieTheaterManager(MovieTheaterDao movieTheaterDao) {
        this.movieTheaterDao = movieTheaterDao;
    }

    @Override
    public Result add(MovieTheater movieTheater) {
        this.movieTheaterDao.save(movieTheater);
        return new SuccessResult("Successfully Added");
    }
}
