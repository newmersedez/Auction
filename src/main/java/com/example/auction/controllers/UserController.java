package com.example.auction.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("")
    public String getAccount() {
        return "Get account info";
    }

    @PostMapping("")
    public String updateAccount() {
        return "Update account info";
    }
}
