package com.lits.demo.controller;

import com.lits.demo.entity.Person;
import com.lits.demo.implementation.AlivePersonService;
import com.lits.demo.mapper.PersonMapper;
import com.lits.demo.repository.PersonDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class WebController {

    @Autowired
    private PersonMapper personMapper;

    @Autowired
    private PersonDataRepository personDataRepository;

    private AlivePersonService alivePersonService;

    @GetMapping("/main")
    public String main (Map<String, Object> model){ // Map model contains list of messages that we will be used
        // in constructing a web pages (the name if web page is {return "HERE"}.
        // eg. {{some}} will be shown on webpage with address "localhost:8080"
        // model.put("some", "lets try by loco. from webcontroller");
        Iterable<Person> findAllPerson = personDataRepository.findAll();
        model.put("person", findAllPerson);
        return "main";
    }
    @PostMapping("/main")
    public String main (
            @RequestParam String personNameWebForm,
            @RequestParam Integer ageWebForm,
            Map<String, Object> model
    ) {
        if (personNameWebForm != null){Person entity = new Person();
        entity.setPersonName(personNameWebForm);
        entity.setAge(ageWebForm);
        personDataRepository.save(entity);
        }
        model.put("person", personDataRepository.findAll());
        return "main";
        }

    @PostMapping("/filter")
    public String main (@RequestParam String filter, Map<String, Object> model) {
        Iterable<Person> findByPersonByName;
        if (filter != null && !filter.isEmpty()) {
            findByPersonByName = personDataRepository.findByPersonName(filter);
        } else {
        findByPersonByName = personDataRepository.findAll();
        }
        model.put("person", findByPersonByName);
        return "main";
        }


    @GetMapping("/")
    public String home (Map<String, Object> model){
        return "home"; // повертає назву сторінки для розширення мусташ. тобто "home" - > home.mustache
    }
}
