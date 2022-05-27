package com.example.demo0527.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demo1 {

    @RequestMapping("/test")
    public String testRest() {
        return "欢迎使用Maven和Spring Boot!";
    }
}