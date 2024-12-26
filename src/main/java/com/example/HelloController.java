package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
  @Value("${app.config.name}")
    private String profile;
    @GetMapping(path="/")
    String hello() {
      System.out.println("profile:"+profile);
        return "Hello World, Spring Boot!";
    }


    @GetMapping(path="/qaautomation")
    String qaautomation() {
        return "Hello QA Automation!";
    }

}