package com.example.project2.bean.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {
     @GetMapping("/A.html")
     public String sbb() {
        System.out.println("index");
        return "A";
     }
     
}
