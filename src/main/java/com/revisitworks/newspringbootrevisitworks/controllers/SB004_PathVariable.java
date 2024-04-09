package com.revisitworks.newspringbootrevisitworks.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class SB004_PathVariable {
    @GetMapping("/message/{message}")
    public String getMessage(@PathVariable String message) {
        return "Your message is: " + message;

    }
}
