package com.gorkem.cinemademo.business.abstracts;

import com.gorkem.cinemademo.core.results.Result;
import com.gorkem.cinemademo.entities.Session;

public interface SessionService {

    Result add(Session session);
}
