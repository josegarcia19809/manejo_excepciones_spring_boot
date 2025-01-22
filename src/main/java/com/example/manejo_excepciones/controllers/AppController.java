package com.example.manejo_excepciones.controllers;

import com.example.manejo_excepciones.models.domain.User;
import com.example.manejo_excepciones.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String index() {
        // int resultado = 500 / 0;
        int resultado = Integer.parseInt("10s");
        System.out.println(resultado);
        return "Hello World";
    }

    @GetMapping("/show/{id}")
    public User show(@PathVariable(name = "id") Long id) {
        User user = userService.findById(id);
        System.out.println(user.getName());
        return user;
    }
}
