package com.example.manejo_excepciones.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class HandleExceptionController {

    @ExceptionHandler({ArithmeticException.class})
    public ResponseEntity<?> divisionByZero(Exception ex) {
        return ResponseEntity.internalServerError().body("Error al dividir entre cero");
    }
}
