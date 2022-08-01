package com.uday.demo.controller.service;

import com.uday.demo.model.User;
import org.springframework.http.ResponseEntity;

public interface UserService {
    public ResponseEntity<?> getUserDetails();
    public ResponseEntity<?> updateUserDetails(User user);
}
