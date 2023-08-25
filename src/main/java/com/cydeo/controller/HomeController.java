package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// @RequestMapping--> gerek yok tek method var zaten
public class HomeController {

    @GetMapping({"/","/home"})
    public String getHome(){
        return "/home";
    }
}
/*
localhost:8080
localhost:8080/
localhost:8080/home hepsi uygun aynı yere cıkar:)
 */