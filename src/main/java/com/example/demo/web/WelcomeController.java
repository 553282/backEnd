package com.example.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController{
    @GetMapping("welcome")
    public String getWelcomeMessage() {
        return "hello Students";
    }
}