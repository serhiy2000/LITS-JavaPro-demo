//package com.lits.demo.controller;
//
//import com.lits.demo.entity.User;
//import com.lits.demo.repository.UserDataRepository;
//import com.lits.demo.service.UserAuthService;
//import io.swagger.annotations.ApiOperation;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping (value = "/api")
//public class UserAuthController {
//
//    private UserAuthService userAuthService;
//
//    @Autowired
//    UserDataRepository userDataRepository;
//
//    @Autowired
//    public UserAuthController(UserAuthService userAuthService){
//        this.userAuthService = userAuthService;
//    }
//
//
//    @PostMapping(value = "/login")
//    @ApiOperation("Authentification loco by userauthcontroller - here you put description of the service to be shown in Swagger.")
//    public ResponseEntity<?> auth(@RequestBody User user){
//        System.out.println("user.getUsername() from UserAuthController (the same as in POST command): "+user.getUsername()); // here works. userName = is the same as in POST request
//        return ResponseEntity.ok(userAuthService.auth(user.getUsername(), user.getPassword()));
//    }
////
////    @PostMapping(value = "/saveUser")
////    @ApiOperation("saveUser")
////    public User save (@RequestBody User user){
////        userDataRepository.save(user);
////        return user;
////    }
////}
////
////@RequestMapping (value = "/api/users")
////public class UserController {
////
////    @PostMapping
////    public ResponseEntity<?> signup(@RequestBody User user) {
////        return ResponseEntity.ok(userAuthService.auth(user.getUsername(), user.getPassword()));
////    }
//
////    @PostMapping
////    public User saveUser(@RequestBody User user) {
////        UserServiceImpl.save(user);
////        return user;
////    }
////}
//}