package com.lits.demo.repository;

import com.lits.demo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PersonDataRepository extends CrudRepository<Person, Integer> {
    Person findOneById (Integer id);

}
