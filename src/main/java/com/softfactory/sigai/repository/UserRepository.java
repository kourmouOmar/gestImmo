package com.softfactory.sigai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.softfactory.sigai.entities.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {
	
	/**
	 * find user by username
	 * 
	 * @param username
	 * @return
	 */
	UserEntity findByUsername(String username);
	
	/**
	 * get all users
	 * 
	 * @return
	 */
	@Query("SELECT u FROM UserEntity u")
	List<UserEntity> getAllUsers();
	
	/**
	 * find user by id
	 * 
	 * @param idUser
	 * @return
	 */
	@Query("SELECT u from UserEntity u WHERE u.id =: id")
	UserEntity findUserById(@Param("id") Long idUser);
}
