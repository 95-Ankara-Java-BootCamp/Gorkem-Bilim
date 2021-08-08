package com.gorkem.cinemademo.business.abstracts;

import com.gorkem.cinemademo.core.results.Result;
import com.gorkem.cinemademo.entities.User;

public interface UserService {

    Result add(User user);
}
