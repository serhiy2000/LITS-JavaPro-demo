package com.lits.demo.service;

import com.lits.demo.dtos.PersonDto;
import com.lits.demo.entity.Person;
import com.lits.demo.repository.PersonDataRepository;
import com.lits.demo.service.impl.AlivePersonService;
import com.lits.demo.service.mapper.PersonMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class AlivePersonServiceTest {

    @Mock
    private PersonDataRepository personDataRepositoryMock;

    @Mock
    private PersonMapper personMapperMock;

    @InjectMocks
    AlivePersonService alivePersonService = new AlivePersonService();

    @Test
    public void shouldSavePerson (){
        PersonDto personDto = new PersonDto();
        Person person = new Person();
        when(personMapperMock.toDto(person)).thenReturn(personDto);
        when(personMapperMock.toEntity(personDto)).thenReturn(person);

        when(personDataRepositoryMock.save (person)).thenReturn(person);

        assertNotNull(
        alivePersonService.save(personDto));
    }

    @Test
    public void shouldGetPerson(){
        Person person = new Person();
        when(personDataRepositoryMock.findOneById(1)).thenReturn(person);
        alivePersonService.getById(1);
        verify(personDataRepositoryMock).findOneById(1);

    }


}
