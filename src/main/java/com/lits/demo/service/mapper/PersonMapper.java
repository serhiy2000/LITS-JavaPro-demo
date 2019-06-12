package com.lits.demo.service.mapper;

import com.lits.demo.dtos.PersonDto;
import com.lits.demo.entity.Person;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class PersonMapper {

    public Person toEntity(PersonDto personDto){
        Person person = new Person();
        person.setUsername(personDto.getUsername());
        person.setAge(personDto.getAge());
        return person;
    }

    public PersonDto toDto (Person person){
        PersonDto personDto = new PersonDto();
        personDto.setUsername(personDto.getUsername());
        personDto.setAge(personDto.getAge());
        return personDto;
    }
}
