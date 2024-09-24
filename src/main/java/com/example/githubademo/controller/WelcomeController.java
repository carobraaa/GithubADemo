package com.example.githubademo.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller


public class WelcomeController {
    @GetMapping("/")
    public String welcome() {
        return "Welcome";
    }

}

