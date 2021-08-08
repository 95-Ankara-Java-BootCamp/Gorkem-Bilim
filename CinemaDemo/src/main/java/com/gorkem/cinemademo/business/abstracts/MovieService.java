package com.gorkem.cinemademo.business.abstracts;

import com.gorkem.cinemademo.core.results.Result;
import com.gorkem.cinemademo.entities.Movie;

public interface MovieService {

    Result add(Movie movie);
}
