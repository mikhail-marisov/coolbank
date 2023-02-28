package com.example.coolbank.service;

import com.example.coolbank.domain.User;

public interface UserService {

    User saveUser(User user);

    User getById(Long id);
}
