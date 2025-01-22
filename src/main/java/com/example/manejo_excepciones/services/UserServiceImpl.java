package com.example.manejo_excepciones.services;

import com.example.manejo_excepciones.models.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private List<User> users;

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public Optional<User> findById(Long id) {
        Optional<User> userOptional = users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();
        return userOptional;
    }
}
