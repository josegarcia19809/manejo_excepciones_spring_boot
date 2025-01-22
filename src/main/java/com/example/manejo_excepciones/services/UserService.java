package com.example.manejo_excepciones.services;

import java.util.List;
import com.example.manejo_excepciones.models.domain.User;

public interface UserService {
    List<User> findAll();
    User findById(Long id);
}
