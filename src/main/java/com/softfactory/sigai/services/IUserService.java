package com.softfactory.sigai.services;

import java.util.List;

import com.softfactory.sigai.controllers.dto.UserDto;
import com.softfactory.sigai.entities.UserEntity;

/**
 * Spring service "User"
 * 
 * @author : kourmou Omar
 * @creation : 31/10/20
 * @version : 1.0
 */
public interface IUserService {
	
	/**
	 * Get all users 
	 * 
	 * @return List<UserEntity>
	 */
	List<UserEntity> getAllUser();
	/**
	 * Save User 
	 * 
	 * @return List<UserEntity>
	 */
	 UserEntity saveUser(UserDto user);
}
