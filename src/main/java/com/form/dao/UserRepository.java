package com.form.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.form.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
}
