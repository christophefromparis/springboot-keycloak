package com.bnpparibas.springbootdemokeycloak.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LandingController {

    @RequestMapping("/")
    public String home() {
        return "Hello";
    }

    @RequestMapping("/protected")
    public String confidential() {
        return ("This page is confidential");
    }
}