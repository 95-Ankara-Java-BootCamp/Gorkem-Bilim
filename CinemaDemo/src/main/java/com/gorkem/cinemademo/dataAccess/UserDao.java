package com.gorkem.cinemademo.dataAccess;

import com.gorkem.cinemademo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
}
