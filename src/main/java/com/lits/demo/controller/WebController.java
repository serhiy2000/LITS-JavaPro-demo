package com.lits.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
public class WebController {


    @GetMapping("/main")
    public String main (Map<String, Object> model){ // Map model contains list of messages that we will use
        // in constructing a web pages. eg. b{{some}} will show on webpage with address "localhost:8080"
        model.put("some", "lets try by loco. from webcontroller");
        return "main";

    }


    @GetMapping("/greeting")
    public String greeting (@RequestParam(name="name", required = false, defaultValue = "loco") String name, Map<String, Object> model){
        model.put("name",name);

        return "greeting"; // повертає лише слово greeting.
    }
}
