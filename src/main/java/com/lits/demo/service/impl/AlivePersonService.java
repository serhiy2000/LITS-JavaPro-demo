package com.lits.demo.service.impl;

import com.lits.demo.dtos.PersonDto;
import com.lits.demo.entity.Person;
import com.lits.demo.repository.PersonDataRepository;
import com.lits.demo.service.PersonService;
import com.lits.demo.service.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service ("alive")

public class AlivePersonService implements PersonService {

    @Autowired
    private PersonDataRepository personDataRepository;

    @Autowired
    private PersonMapper personMapper;

    @Override
    public PersonDto getById(Integer id) {
        return personMapper.toDto(personDataRepository.findOne(id));
    }

    @Override
    public List<PersonDto> getAllPersons (){
        return null;
//                personMapper.toDto(personDataRepository.findAll());
    }

    @Override
    public PersonDto save(PersonDto personDto) {
        Person entity = personMapper.toEntity(personDto);

        return personMapper.toDto(personDataRepository.save(entity));
    }
}
