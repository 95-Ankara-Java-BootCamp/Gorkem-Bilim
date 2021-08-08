package com.gorkem.cinemademo.business.abstracts;

import com.gorkem.cinemademo.core.results.Result;
import com.gorkem.cinemademo.entities.MovieTheater;

public interface MovieTheaterService {

    Result add(MovieTheater movieTheater);
}
