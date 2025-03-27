package com.caoliang.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/index")
    public String index(){
        return "user index";
    }

    @GetMapping("/info")
    public Principal info(Principal principal){
        return principal;
    }
}
