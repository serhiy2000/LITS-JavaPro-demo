package com.lits.demo.implementation;

import com.lits.demo.dtos.PersonDto;
import com.lits.demo.entity.Person;
import com.lits.demo.repository.PersonDataRepository;
import com.lits.demo.service.PersonService;
import com.lits.demo.mapper.PersonMapper;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service ("dead")
@Slf4j
@Data
public class DeadPersonService implements PersonService {

    @Autowired
    private PersonDataRepository personDataRepository;

    @Autowired
    private PersonMapper personMapper;

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
            Person entity = personMapper.toEntity(personDto) ;

            return personMapper.toDto(personDataRepository.save(entity));
    }
}
