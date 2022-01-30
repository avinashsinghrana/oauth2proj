package com.auth.credential.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/*")
    public String home() {
        return "This is home page";
    }

    @GetMapping("/login")
    public String login() {
        return "This is login page";
    }

    @GetMapping("/register")
    public String register() {
        return "This is register page";
    }
}
