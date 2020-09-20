package com.service.consumingRest.controller;

import com.service.consumingRest.model.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GreetingController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumingRest")
    public String consumeMsg(){
        Greeting greeting = restTemplate.getForObject("http://localhost:8080/greet?name=raghu",Greeting.class);
        return greeting.toString();

    }
}
