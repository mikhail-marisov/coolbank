package com.example.coolbank.service;

import com.example.coolbank.domain.Account;
import com.example.coolbank.domain.User;

import java.util.Set;

public interface UserService {

    User saveUser(User user);

    User getById(Long id);

    Set<Account> getUserAccountsByUserId(Long id);
}
