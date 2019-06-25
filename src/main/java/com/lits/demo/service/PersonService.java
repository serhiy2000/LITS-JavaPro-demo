package com.lits.demo.service;

import com.lits.demo.dtos.PersonDto;
import com.lits.demo.entity.Person;

import java.util.List;

public interface PersonService {

    PersonDto getById (Integer Id);

    List<Person> getAllPersons();

    PersonDto save (PersonDto personDto);
}
