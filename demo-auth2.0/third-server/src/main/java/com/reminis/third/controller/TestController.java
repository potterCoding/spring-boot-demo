package com.reminis.third.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author sql
 * @version 1.0.0
 * @date 2021/8/24 10:40
 */
@Controller
public class TestController {

    @GetMapping("/index.html")
    public String index() {
        return "index";
    }
}
