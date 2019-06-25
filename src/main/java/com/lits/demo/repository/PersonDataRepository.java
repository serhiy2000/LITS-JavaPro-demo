package com.lits.demo.repository;

import com.lits.demo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonDataRepository extends JpaRepository<Person, Integer> {
    Person findOneById(Integer id);

}
