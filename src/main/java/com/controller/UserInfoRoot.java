package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoRoot {
    @GetMapping (value = "/")
    public String defult(){
        return "All runing";
    }
}
