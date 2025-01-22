package com.example.manejo_excepciones.controllers;

import com.example.manejo_excepciones.exceptions.UserNotFoundException;
import com.example.manejo_excepciones.models.domain.User;
import com.example.manejo_excepciones.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

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
    public ResponseEntity<?> show(@PathVariable(name = "id") Long id) {
//        User user = userService.findById(id).orElseThrow(()-> new UserNotFoundException(
//                "Error, el usuario no existe"));
//        System.out.println(user.getName());
        Optional<User> optionalUser = userService.findById(id);
        if(optionalUser.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(optionalUser.get());
    }
}
