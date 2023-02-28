package com.example.coolbank.repository;

import com.example.coolbank.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepositoty extends JpaRepository<Account, Long> {
}
