package com.springsecurity.springsecuritytraining.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloEndpoint {

    @GetMapping("/hello")
    public String hello1() {
        return "Hello! you made it !!!";
    }
}
