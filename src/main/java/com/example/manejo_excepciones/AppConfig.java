package com.example.manejo_excepciones;

import com.example.manejo_excepciones.models.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public List<User> users(){
        List<User> users;
        users = new ArrayList<>();
        users.add(new User(1L, "Luis", "Garcia"));
        users.add(new User(2L, "José", "Garcia"));
        users.add(new User(3L, "Armando", "Garcia"));
        users.add(new User(4L, "Laura", "Garcia"));
        users.add(new User(5L, "Carolina", "Garcia"));
        users.add(new User(6L, "Rox", "Garcia"));
        return users;
    }
}
