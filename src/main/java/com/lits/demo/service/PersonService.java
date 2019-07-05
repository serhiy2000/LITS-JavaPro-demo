package com.lits.demo.service;

import com.lits.demo.dtos.PersonDto;
import com.lits.demo.entity.Person;

import java.util.List;

public interface PersonService {

    PersonDto findOneById (Integer Id);

    List<PersonDto> getAllPersons();

    PersonDto save (PersonDto personDto);
}
