package com.example.sprin_app.controller;

import com.example.sprin_app.service.HelloWorldService;
import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController // Define que será um controller Rest
@RequestMapping("/hello-world") //Definição do endpoint
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;


    @GetMapping
    public String helloWorld() {
        return helloWorldService.helloWorld(" Victor");
    }

    @PostMapping
    public String helloWorldPost(@RequestBody User body) {
        return  "Hello World" + body.getName();
    }
}
