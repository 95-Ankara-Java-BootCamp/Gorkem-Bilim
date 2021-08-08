package com.gorkem.cinemademo.api.controllers;

import com.gorkem.cinemademo.business.abstracts.SessionService;
import com.gorkem.cinemademo.core.results.Result;
import com.gorkem.cinemademo.entities.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sessions")
public class SessionsController {

    private SessionService sessionService;

    @Autowired
    public SessionsController(SessionService sessionService) {
        this.sessionService = sessionService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody Session session) {
        return this.sessionService.add(session);
    }
}
