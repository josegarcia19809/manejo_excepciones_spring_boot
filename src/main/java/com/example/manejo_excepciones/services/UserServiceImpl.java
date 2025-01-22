package com.example.manejo_excepciones.services;

import com.example.manejo_excepciones.models.domain.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private List<User> users;

    public UserServiceImpl() {
        this.users = new ArrayList<>();
        users.add(new User(1L, "Luis", "Garcia"));
        users.add(new User(2L, "José", "Garcia"));
        users.add(new User(3L, "Armando", "Garcia"));
        users.add(new User(4L, "Laura", "Garcia"));
        users.add(new User(5L, "Carolina", "Garcia"));
        users.add(new User(6L, "Rox", "Garcia"));
    }

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public Optional<User> findById(Long id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }
}
