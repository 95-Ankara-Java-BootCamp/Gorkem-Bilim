package com.gorkem.cinemademo.business.concretes;

import com.gorkem.cinemademo.business.abstracts.UserService;
import com.gorkem.cinemademo.core.results.Result;
import com.gorkem.cinemademo.core.results.SuccessResult;
import com.gorkem.cinemademo.dataAccess.UserDao;
import com.gorkem.cinemademo.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManager implements UserService {

    private UserDao userDao;

    @Autowired
    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public Result add(User user) {
        this.userDao.save(user);
        return new SuccessResult("Successfully Added");
    }
}
