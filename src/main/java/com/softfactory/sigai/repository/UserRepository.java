package com.softfactory.sigai.repository;

import org.springframework.data.repository.CrudRepository;

import com.softfactory.sigai.entities.UserEntity;


public interface UserRepository extends CrudRepository<UserEntity, Long> {
	
	UserEntity findByUsername(String username);
}
