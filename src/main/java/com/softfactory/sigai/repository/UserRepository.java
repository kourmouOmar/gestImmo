package com.softfactory.sigai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softfactory.sigai.entities.UserEntity;


public interface UserRepository extends JpaRepository<UserEntity, Long> {
	
	UserEntity findByUsername(String username);
}
