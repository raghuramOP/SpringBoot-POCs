package com.demo.restservice.controller;


import com.demo.restservice.entity.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetController {

    private static final String template = "Hello, %s";
    private final AtomicLong count = new AtomicLong();

    @GetMapping("/greet")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name){
        return 
    }
}
