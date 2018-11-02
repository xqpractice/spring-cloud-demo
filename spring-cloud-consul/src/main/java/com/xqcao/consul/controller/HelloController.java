package com.xqcao.consul.controller;

import com.xqcao.consul.module.HelloResult;
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
