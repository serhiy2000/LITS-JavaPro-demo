package com.lits.demo.repository;

import com.lits.demo.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDataRepository extends JpaRepository <UserEntity, Integer> {

    UserEntity findOneByUsername (String username);
}
