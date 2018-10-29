package com.xqcao.eureka.client.controller;

import com.xqcao.eureka.client.module.HelloResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello/{message}")
    public HelloResult getHelloResult(@PathVariable String message) {
        return new HelloResult(message);
    }
}
