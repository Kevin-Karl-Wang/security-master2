package com.security.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/hello.do")
    public String hello() {
        return "hello Spring Security!";
    }
}
