package com.example.demo0527.Controller;

import java.util.HashMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class TestControllerRest {

    @RequestMapping("/hello")
    public String getPage(HashMap<String, String> map) {
        map.put("title", "欢迎来到Spring Boot!");
        return "/index";
    }
}