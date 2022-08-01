package com.uday.demo.controller;

import com.uday.demo.controller.service.UserService;
import com.uday.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public String getMessage(){
        return "Hello world!";
    }

    @GetMapping("/v1")
    public ResponseEntity getuserDetails(){
        return userService.getUserDetails();
    }

    @PostMapping("/v1")
    public ResponseEntity saveUserDetails(@RequestBody User user){
        return userService.updateUserDetails(user);
    }

}
