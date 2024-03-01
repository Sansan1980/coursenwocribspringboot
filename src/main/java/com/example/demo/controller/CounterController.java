package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class CounterController {

    @GetMapping
    public String hello() {
        return "Hello, world!";
    }
}
