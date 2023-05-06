package com.example.demo.Controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {
    @GetMapping("/")
    public String hola(){
        return "Hola Mundo";
    }
}
