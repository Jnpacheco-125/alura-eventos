package com.alura.aluraeventos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaMundo {
    @GetMapping("/io")
    public String digaOla(){
        return "Ola mundo";
    }
}
