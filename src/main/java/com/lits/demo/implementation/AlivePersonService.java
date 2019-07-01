package com.lits.demo.implementation;

import com.lits.demo.dtos.PersonDto;
import com.lits.demo.entity.Person;
import com.lits.demo.repository.PersonDataRepository;
import com.lits.demo.service.PersonService;
import com.lits.demo.mapper.PersonMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service ("alive")
@Slf4j

public class AlivePersonService implements PersonService {

    @Autowired
    private PersonDataRepository personDataRepository;

    @Autowired
    private PersonMapper personMapper;

    @Override
    public PersonDto getById(Integer id) {
        return personMapper.toDto(personDataRepository.findOneById(id));
    }

    @Override
    public List<Person> getAllPersons (){
        return personDataRepository.findAll();


//        if () {    - тут написано як працює логер від лобмоку
//            throw new RuntimeException("User not found");
//            log.error("User not found");
//        }
    }

    @Override
    public PersonDto save(PersonDto personDto) {
        Person entity = personMapper.toEntity(personDto);
        return personMapper.toDto(personDataRepository.save(entity));
    }

}
