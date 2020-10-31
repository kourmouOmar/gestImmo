package com.softfactory.sigai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.softfactory.sigai.entities.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {
	
	UserEntity findByUsername(String username);
	
	@Query("SELECT u FROM UserEntity u")
	List<UserEntity> getAllUsers();
}
