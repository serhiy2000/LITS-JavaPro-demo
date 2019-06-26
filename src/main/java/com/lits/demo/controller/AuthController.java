package com.lits.demo.controller;

import com.lits.demo.model.UserEntity;
import com.lits.demo.service.impl.UserServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (value = "/api")
public class AuthController {

    @PostMapping (path = "auth");
    public ResponseEntity <?> login (){

    }

    @PostMapping
    public UserEntity savePerson (@RequestBody UserEntity user){

        return UserServiceImpl.save(user);
    }

}
