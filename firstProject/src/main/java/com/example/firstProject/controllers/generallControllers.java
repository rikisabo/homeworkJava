package com.example.firstProject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/general")
public class generallControllers {
@GetMapping("/")
    public String index() {
    return "Hello World";
}
@GetMapping("/name/{name}")
    public String name(@PathVariable String name) {
    return "name"+name;
}
}
