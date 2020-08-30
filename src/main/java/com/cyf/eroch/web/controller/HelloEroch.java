package com.cyf.eroch.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloEroch {
    @GetMapping("/")
    String sayHi(){
        return "Hello Eroch";
    }

}
