package com.lits.demo.repository;

import com.lits.demo.entity.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PersonDataRepository extends CrudRepository <Person, Integer> {
    Person findOne (Integer integer);
}
