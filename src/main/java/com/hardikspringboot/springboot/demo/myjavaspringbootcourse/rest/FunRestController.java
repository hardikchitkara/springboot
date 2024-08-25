package com.hardikspringboot.springboot.demo.myjavaspringbootcourse.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String sayHello() {
        return "hello world";
    }
}
