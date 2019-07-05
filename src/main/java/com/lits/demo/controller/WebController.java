package com.lits.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class WebController {

    @GetMapping("/greeting")
    public String greeting (@RequestParam(name="name", required = false, defaultValue = "loco") String name, Model model){
        model.addAttribute("name",name);

        return "greeting"; // повертає лише слово greeting.
    }
}
