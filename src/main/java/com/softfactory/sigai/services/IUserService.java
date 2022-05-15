/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.services;

import java.util.List;

import com.softfactory.sigai.controllers.dto.UtilisateurDto;
import com.softfactory.sigai.entities.UtilisateurEntity;

/**
 * Spring service user
 * 
 * @author omarkourmou1
 *
 */
public interface IUserService {

	/**
	 * get user by id
	 * 
	 * @param iduser
	 * @return
	 */
	UtilisateurEntity getUserById(Long iduser);

	/**
	 * get all user
	 * 
	 * @return List<UtilisateurEntity>
	 */
	List<UtilisateurEntity> getAllUsers();

	/**
	 * add user
	 * 
	 * @param userDto
	 * @return
	 */
	UtilisateurEntity addUser(UtilisateurDto userDto);

	/**
	 * update user
	 * 
	 * @param userDto
	 * @return
	 */
	UtilisateurEntity updateUser(UtilisateurDto userDto);

	/**
	 * delete user
	 * 
	 * @param iduser
	 */
	void deleteUser(Long iduser);

}