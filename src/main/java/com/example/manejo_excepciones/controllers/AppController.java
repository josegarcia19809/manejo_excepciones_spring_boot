package com.example.manejo_excepciones.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping("/app")
    public String index() {
        int resultado = 500 / 0;
        System.out.println(resultado);
        return "Hello World";
    }
}
