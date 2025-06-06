package com.Rakshak.Project1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloConrtoller {
    @GetMapping("/hello")       //Maps HTTP GET Request from the client
    public String sayHello(){
        return "Hello,World from my First Controller";
    }

    @GetMapping("/user/name") // Maps HTTP Request from the client
    public String getUserName(){
        return "Hello world from my first Controller";
    }
}

// client - controller - service - repository
//controller- Handles incoming http requests
//services-  handles bussiness logic
//repository- handles database operation
