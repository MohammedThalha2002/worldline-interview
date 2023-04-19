package com.worldline.employee.employeereg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/details")
    public String details(){
        return "details";
    }
}
