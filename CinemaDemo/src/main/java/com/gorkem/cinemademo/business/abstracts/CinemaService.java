package com.gorkem.cinemademo.business.abstracts;

import com.gorkem.cinemademo.core.results.Result;
import com.gorkem.cinemademo.entities.Cinema;

public interface CinemaService {

    Result add(Cinema cinema);
}
