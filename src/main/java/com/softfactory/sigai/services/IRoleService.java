/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.services;

import java.util.List;

import com.softfactory.sigai.controllers.dto.RoleDto;
import com.softfactory.sigai.entities.RoleEntity;

/**
 * Spring service "Role"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */
public interface IRoleService{

/**
	 * Get Role by Id
	 * 
	 * @param idRole
	 * @return RoleEntity
	 */
	RoleEntity getRoleById(Long idRole);

	/**
	 * get all Role
	 *
	 * @return List<RoleEntity>
	 */
	List<RoleEntity> getAllRoles();

	/**
	 * add Role
	 *
	 * @param RoleDto
	 * @return RoleEntity
	 */
	RoleEntity addRole(RoleDto RoleDto);

	/**
	 * update Role
	 *
	 * @param RoleDto
	 * @return RoleEntity
	 */
	RoleEntity updateRole(RoleDto RoleDto);

	/**
	 * delete Role
	 *
	 * @param idRole
	 * @return RoleEntity
	 */
	void deleteRole(Long idRole);

}