package com.gorkem.cinemademo.business.abstracts;

import com.gorkem.cinemademo.core.results.Result;
import com.gorkem.cinemademo.entities.MovieCategory;

public interface MovieCategoryService {

    Result add(MovieCategory movieCategory);
}
