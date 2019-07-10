package com.lits.demo.controller;

import com.lits.demo.entity.User;
import com.lits.demo.service.UserAuthService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (value = "/api")
public class UserAuthController {

    private UserAuthService userAuthService;

    @Autowired
    public UserAuthController(UserAuthService userAuthService){
        this.userAuthService = userAuthService;
    } // проблема з токеном була у відсутності цього рядка. П.С. - розібратись - як воно працює!!!!


    @PostMapping(value = "/login")
    @ApiOperation("auth") // -this is for swagger annotation
    public ResponseEntity<?> auth(@RequestBody User user){

        System.out.println("user.getUsername() from UserAuthController (the same as in POST command): "+user.getUsername()); // here works. userName = is the same as in POST request

        return ResponseEntity.ok(userAuthService.auth(user.getUsername(), user.getPassword()));
    }

//
//    @PostMapping
//    public User savePerson (@RequestBody User user){
//
//        return UserServiceImpl.savePersonToDataBase(user);
//    }
//}
//
//@RequestMapping (value = "/api/users")
//public class UserController {
//
//    @PostMapping
//    public ResponseEntity<?> signup(@RequestBody User user) {
//        return ResponseEntity.ok(userAuthService.auth(user.getUsername(), user.getPassword()));
//    }

//    @PostMapping
//    public User saveUser(@RequestBody User user) {
//        UserServiceImpl.savePersonToDataBase(user);
//        return user;
//    }
//}
}