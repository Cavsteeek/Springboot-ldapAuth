package com.cavsteek.ldapAuth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class LdapAuthController {
    @GetMapping("/")
    public String index() {
        return "Welcome to the home page!";
    }
}
