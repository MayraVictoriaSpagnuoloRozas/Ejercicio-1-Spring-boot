package com.example.demo.Controlador;

import org.springframework.web.bind.annotation.GetMapping;

public class Controlador {
    @GetMapping("/")
    public String hola(){
        return "Hola Mundo";
    }
}
