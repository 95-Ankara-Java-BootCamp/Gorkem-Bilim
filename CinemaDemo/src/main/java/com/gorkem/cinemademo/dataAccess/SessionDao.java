package com.gorkem.cinemademo.dataAccess;

import com.gorkem.cinemademo.entities.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionDao extends JpaRepository<Session, Integer> {
}
