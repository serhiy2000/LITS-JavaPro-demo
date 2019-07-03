package com.lits.demo.repository;

import com.lits.demo.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserDataRepository extends CrudRepository <User, Integer> {
    User findOne(String username);
}

