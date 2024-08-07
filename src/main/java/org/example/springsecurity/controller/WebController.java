package org.example.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping("/public")
    public String hello() {
        return "views/public";
    }

    @GetMapping("/private")
    public String exclusive() {
        return "views/private";
    }
}
