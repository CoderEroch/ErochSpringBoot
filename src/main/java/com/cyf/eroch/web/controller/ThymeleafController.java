package com.cyf.eroch.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ThymeleafController {
    @GetMapping(value = "/index")
    public String index(Model model){
        model.addAttribute("name","陈跃飞");
        return "index";
    }
}
