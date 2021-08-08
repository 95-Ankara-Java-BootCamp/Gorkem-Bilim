package com.gorkem.cinemademo.business.concretes;

import com.gorkem.cinemademo.business.abstracts.CinemaService;
import com.gorkem.cinemademo.core.results.Result;
import com.gorkem.cinemademo.core.results.SuccessResult;
import com.gorkem.cinemademo.dataAccess.CinemaDao;
import com.gorkem.cinemademo.entities.Cinema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CinemaManager implements CinemaService {

    private CinemaDao cinemaDao;

    @Autowired
    public CinemaManager(CinemaDao cinemaDao) {
        this.cinemaDao = cinemaDao;
    }

    @Override
    public Result add(Cinema cinema) {
        this.cinemaDao.save(cinema);
        return new SuccessResult("Successfully Added");
    }
}
