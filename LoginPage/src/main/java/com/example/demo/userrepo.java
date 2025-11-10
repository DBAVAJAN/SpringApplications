package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface userrepo extends JpaRepository<userdetails,Integer> {
public userdetails findByUsername(String username);
}
