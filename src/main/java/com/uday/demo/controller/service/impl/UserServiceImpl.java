package com.uday.demo.controller.service.impl;

import com.uday.demo.controller.service.UserService;
import com.uday.demo.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public ResponseEntity<?> getUserDetails() {
        User  user= new User();
        user.setFirstName("Uday");
        user.setLastName("Kumar");
        user.setAddress("INDIA");
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> updateUserDetails(User user) {
        System.out.println(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }
}
