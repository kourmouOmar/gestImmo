package com.softfactory.sigai.dao;

import org.springframework.data.repository.CrudRepository;

import com.softfactory.sigai.entities.UserEntity;


public interface UserRepository extends CrudRepository<UserEntity, Long> {
	
	UserEntity findByUsername(String username);
}
