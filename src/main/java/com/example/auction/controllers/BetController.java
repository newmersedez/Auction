package com.example.auction.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bets")
public class BetController {

    @GetMapping("")
    public String getBets() {
        return "Get all bets";
    }

    @GetMapping("/{id}")
    public String getBet(@PathVariable String id) {
        return "Get bet by id";
    }

    @PostMapping("")
    public String addBet() {
        return "Add new bet";
    }
}
