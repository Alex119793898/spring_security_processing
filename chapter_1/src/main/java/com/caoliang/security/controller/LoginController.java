package com.caoliang.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/authentication/login")
    public String authenticationLogin(){
        return "login";
    }
}
