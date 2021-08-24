package com.reminis.resource.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sql
 * @version 1.0.0
 * @date 2021/8/24 10:34
 */
@RestController
public class HelloController {

    @GetMapping("/user/resource")
    public String hello() {
        return "8081-user-resource";
    }
}
