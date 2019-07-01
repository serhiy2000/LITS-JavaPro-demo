package com.lits.demo.controller;

import com.lits.demo.dtos.AuthRequest;
import com.lits.demo.model.UserEntity;
import com.lits.demo.implementation.UserServiceImpl;
import com.lits.demo.service.AuthService;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (value = "/api")
public class AuthController {

    private AuthService authService;

    @PostMapping(value = "/login")
//    @ApiOperation("auth")
    public ResponseEntity<?> auth(@RequestBody UserEntity user){

        System.out.println("user.getUsername() from AuthController (the same as in POST command): "+user.getUsername()); // here works. userName = is the same as in POST request

        return ResponseEntity.ok(authService.auth(user.getUsername(), user.getPassword()));
    }

//
//    @PostMapping
//    public UserEntity savePerson (@RequestBody UserEntity user){
//
//        return UserServiceImpl.save(user);
//    }
//}

//@RequestMapping (value = "/api/users")
//public class UserController {
//
//    @PostMapping
//    public ResponseEntity<?> signup() {
//
//    }

//    @PostMapping
//    public UserEntity saveUser(@RequestBody UserEntity user) {
//        UserServiceImpl.save(user);
//        return user;
//    }
//}
}