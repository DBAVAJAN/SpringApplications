package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecurityRepo extends JpaRepository <credentials,Integer>{
	public credentials findByUsername(String username);

}
