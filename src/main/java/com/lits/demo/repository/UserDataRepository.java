package com.lits.demo.repository;

import com.lits.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDataRepository extends JpaRepository <User, Integer> {

    User findOneByUsername (String username);
}
