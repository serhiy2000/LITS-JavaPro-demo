package com.lits.demo.service.mapper;

import com.lits.demo.dtos.PersonDto;
import com.lits.demo.entity.Person;
import org.springframework.stereotype.Component;

@Component
public class PersonMapper {

    public Person toEntity(PersonDto personDto) {
        Person person = new Person();
        person.setUsername(personDto.getUsername());
        person.setAge(personDto.getAge());
        person.setId(personDto.getId());
        person.setDead(personDto.isDead());
        return person;
    }

    public PersonDto toDto(Person person) {
        PersonDto personDto = new PersonDto();
        personDto.setUsername(person.getUsername());
        personDto.setAge(person.getAge());
        personDto.setId(person.getId());
        personDto.setDead(person.isDead());
        return personDto;
    }
}

