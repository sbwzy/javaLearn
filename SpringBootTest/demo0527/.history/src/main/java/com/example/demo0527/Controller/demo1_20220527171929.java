package com.example.demo0527.Controller;

import java.util.HashMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class demo1 {

    @RequestMapping("/test")
    public String testRest() {
        map.put("title", "欢迎来到Spring Boot!");
        return "/index";
    }
}