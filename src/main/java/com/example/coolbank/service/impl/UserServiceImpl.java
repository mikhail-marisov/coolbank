package com.example.coolbank.service.impl;

import com.example.coolbank.domain.User;
import com.example.coolbank.repository.UserRepository;
import com.example.coolbank.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) {
        userRepository.save(user);
        return user;
    }

    @Override
    public User getById(Long id) {
        return userRepository.findById(id).get();
    }
}
