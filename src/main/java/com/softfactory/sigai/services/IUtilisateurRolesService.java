/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.services;

import java.util.List;

import com.softfactory.sigai.controllers.dto.UtilisateurRolesDto;
import com.softfactory.sigai.entities.UtilisateurRolesEntity;

/**
 * Spring service "UtilisateurRoles"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */
public interface IUtilisateurRolesService{

/**
	 * Get UtilisateurRoles by Id
	 * 
	 * @param idUtilisateurRoles
	 * @return UtilisateurRolesEntity
	 */
	UtilisateurRolesEntity getUtilisateurRolesById(Long idUtilisateurRoles);

	/**
	 * get all UtilisateurRoles
	 *
	 * @return List<UtilisateurRolesEntity>
	 */
	List<UtilisateurRolesEntity> getAllUtilisateurRoless();

	/**
	 * add UtilisateurRoles
	 *
	 * @param UtilisateurRolesDto
	 * @return UtilisateurRolesEntity
	 */
	UtilisateurRolesEntity addUtilisateurRoles(UtilisateurRolesDto UtilisateurRolesDto);

	/**
	 * update UtilisateurRoles
	 *
	 * @param UtilisateurRolesDto
	 * @return UtilisateurRolesEntity
	 */
	UtilisateurRolesEntity updateUtilisateurRoles(UtilisateurRolesDto UtilisateurRolesDto);

	/**
	 * delete UtilisateurRoles
	 *
	 * @param idUtilisateurRoles
	 * @return UtilisateurRolesEntity
	 */
	void deleteUtilisateurRoles(Long idUtilisateurRoles);

}