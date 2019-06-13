package com.lits.demo.web;

import com.lits.demo.dtos.PersonDto;
import com.lits.demo.entity.Person;
import com.lits.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController(value = "/api")
public class PersonController {

    @Autowired
    @Qualifier (value = "alive")
    private PersonService alivePersonService;

    @Autowired
    @Qualifier (value = "dead")
    private PersonService deadPersonService;

    @GetMapping
    public List<PersonDto> getPersonbyId (){
        return alivePersonService.getAllPersons();
    }

//    @GetMapping (value = "/user?id")
//    public PersonDto getPersonById (@RequestParam Integer id){
//        return alivePersonService.getById(id);
//    }

    @GetMapping(value = "/user/{id}")
    public PersonDto getPersonById(@PathVariable Integer id) {
        return alivePersonService.getById(id);
    }

    @PostMapping
    public PersonDto savePerson (@RequestBody PersonDto person){
        return alivePersonService.save(person);
    }

}
