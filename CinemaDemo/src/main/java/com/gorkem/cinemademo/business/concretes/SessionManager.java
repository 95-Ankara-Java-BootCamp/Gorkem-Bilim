package com.gorkem.cinemademo.business.concretes;

import com.gorkem.cinemademo.business.abstracts.SessionService;
import com.gorkem.cinemademo.core.results.Result;
import com.gorkem.cinemademo.core.results.SuccessResult;
import com.gorkem.cinemademo.dataAccess.SessionDao;
import com.gorkem.cinemademo.entities.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SessionManager implements SessionService {

    private SessionDao sessionDao;

    @Autowired
    public SessionManager(SessionDao sessionDao) {
        this.sessionDao = sessionDao;
    }

    @Override
    public Result add(Session session) {
        this.sessionDao.save(session);
        return new SuccessResult("Successfully Added!");

    }
}
