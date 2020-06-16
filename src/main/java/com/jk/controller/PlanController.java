package com.jk.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PlanController {

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }
}
