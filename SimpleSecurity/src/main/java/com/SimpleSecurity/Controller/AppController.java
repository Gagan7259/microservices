package com.SimpleSecurity.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Test")
public class AppController {
    @GetMapping
    public String show() {
        return "Hey Good Morning";
    }
}
