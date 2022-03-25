package com.example.auction.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lots")
public class LotController {

    @GetMapping("")
    public String getLots() {
        return "Get all lots";
    }

    @GetMapping("/{id}")
    public String getLot(@PathVariable String id) {
        return "Get lot by id";
    }

    @PostMapping("")
    public String addLot() {
        return "Add new lot";
    }
}
