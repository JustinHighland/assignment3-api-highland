package com.example.assignment3.characters;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice(annotations = Controller.class)
public class UIExceptionHandler {

    @ExceptionHandler(CharacterNotFoundException.class)
    public String handleCharacterNotFound() {
        return "error";
    }
}