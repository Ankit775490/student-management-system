package com.studentmanagement.App.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class exmple {
    @GetMapping("/start")
    public String display(){
        return "done by ankit";
    }
}
