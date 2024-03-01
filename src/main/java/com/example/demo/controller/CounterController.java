package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CounterController {
    private int count;

    @GetMapping
    public String hello() {
        return "Hello, world!";
    }

    @GetMapping("/counter")
    public String count() {
        this.count++;
        return "Количество запросов: " + this.count;
    }
}
