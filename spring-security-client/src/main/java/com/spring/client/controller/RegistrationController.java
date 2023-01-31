package com.spring.client.controller;

import com.spring.client.entity.User;
import com.spring.client.model.UserModel;
import com.spring.client.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class RegistrationController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody UserModel userModel) {
        User user = userService.registerUser(userModel);
        return ResponseEntity.ok(user);
    }
}
