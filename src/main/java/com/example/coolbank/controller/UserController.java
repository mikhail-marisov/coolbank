package com.example.coolbank.controller;

import com.example.coolbank.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

public interface UserController {

    @GetMapping("/{userId}")
    User getUserById(@PathVariable("userId") Long userId);

    @PostMapping("/user")
    User saveUser(User user);
}
