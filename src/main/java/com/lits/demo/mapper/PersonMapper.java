package com.lits.demo.mapper;

import com.lits.demo.dtos.PersonDto;
import com.lits.demo.entity.Person;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class PersonMapper {

    public Person toEntity(PersonDto personDto) {
        Person person = new Person();
        person.setPersonName(personDto.getPersonName());
        person.setAge(personDto.getAge());
        person.setId(personDto.getId());
        person.setDead(personDto.isDead());
        return person;
    }

    public PersonDto toDto(Person person) {
        PersonDto personDto = new PersonDto();
        personDto.setPersonName(person.getPersonName());
        personDto.setAge(person.getAge());
        personDto.setId(person.getId());
        personDto.setDead(person.isDead());
        return personDto;
    }
}

