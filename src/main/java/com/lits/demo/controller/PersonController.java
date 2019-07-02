package com.lits.demo.controller;

import com.lits.demo.dtos.PersonDto;
import com.lits.demo.entity.Person;
import com.lits.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//
//@RestController
//@RequestMapping(value = "/api")
//public class PersonController {
//
//    @Autowired
//    @Qualifier (value = "alive")
//    private PersonService alivePersonService;
//
//    @Autowired
//    @Qualifier (value = "dead")
//    private PersonService deadPersonService;
//
//    @GetMapping (value = "/user")
//    public List<PersonDto> getAllPersons (){
//        return null;
////        alivePersonService.getAllPersons();
//    }
////
////    @GetMapping (value = "/user?id")
////    public PersonDto getPersonById (@RequestParam Integer id){
////        return alivePersonService.getById(id);
////    }
//
//    @GetMapping(value = "/user/{id}")
//    public PersonDto getPersonById(@PathVariable Integer id) {
//        return alivePersonService.getById(id);
//    }
//
//    @PostMapping
//    public PersonDto savePerson (@RequestBody PersonDto person){
//
////        Person person = Person.builder()   -   тут описано як працює lombok builder!
////                .age(12)
////                .username("serfgf")
////                .dead(false);
//
//        return alivePersonService.save(person);
//    }
//
//}
