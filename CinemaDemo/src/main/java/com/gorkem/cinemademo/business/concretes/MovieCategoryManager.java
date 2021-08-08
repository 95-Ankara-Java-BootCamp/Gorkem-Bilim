package com.gorkem.cinemademo.business.concretes;

import com.gorkem.cinemademo.business.abstracts.MovieCategoryService;
import com.gorkem.cinemademo.core.results.Result;
import com.gorkem.cinemademo.core.results.SuccessResult;
import com.gorkem.cinemademo.dataAccess.MovieCategoryDao;
import com.gorkem.cinemademo.entities.MovieCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieCategoryManager implements MovieCategoryService {

    private MovieCategoryDao movieCategoryDao;

    @Autowired
    public MovieCategoryManager(MovieCategoryDao movieCategoryDao) {
        this.movieCategoryDao = movieCategoryDao;
    }

    @Override
    public Result add(MovieCategory movieCategory) {
        this.movieCategoryDao.save(movieCategory);
        return new SuccessResult("Successfully Added");
    }
}
