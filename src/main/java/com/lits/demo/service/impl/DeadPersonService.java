package com.lits.demo.service.impl;

import com.lits.demo.dtos.PersonDto;
import com.lits.demo.entity.Person;
import com.lits.demo.repository.PersonDataRepository;
import com.lits.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service ("dead")
public class DeadPersonService implements PersonService {

    @Autowired
    private PersonDataRepository personDataRepository;

    @Override
    public PersonDto getById(Integer Id) {

        return null;
    }

    @Override
    public List<Person> getAllPersons (){
        return null;

    }

    @Override

        public PersonDto save(PersonDto personDto) {
            Person person = new Person();
            person.setUsername(personDto.getUsername());
            person.setAge(personDto.getAge());

            return null;
    }
}
