package com.example.auction.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registration")
public class RegistrationController {

    @GetMapping("")
    public String loginAccount() {
        return "Account sign in";
    }

    @PostMapping("")
    public String registerAccount() {
        return "Account registration";
    }
}
