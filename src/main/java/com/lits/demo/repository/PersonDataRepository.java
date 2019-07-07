package com.lits.demo.repository;

import com.lits.demo.entity.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonDataRepository extends CrudRepository<Person, Integer> {
    Person findOneById (Integer id);

    List<Person> findByPersonName(String personName);
}
