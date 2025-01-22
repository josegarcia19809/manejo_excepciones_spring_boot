package com.example.manejo_excepciones.services;

import java.util.List;
import java.util.Optional;

import com.example.manejo_excepciones.models.domain.User;

public interface UserService {
    List<User> findAll();
    Optional<User> findById(Long id);
}
