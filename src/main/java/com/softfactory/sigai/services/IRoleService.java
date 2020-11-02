package com.softfactory.sigai.services;

import java.util.List;

import com.softfactory.sigai.controllers.dto.RoleDto;
import com.softfactory.sigai.entities.RoleEntity;

/**
 * Spring service "Role"
 * 
 * @author : kourmou Omar
 * @creation : 31/10/20
 * @version : 1.0
 */
public interface IRoleService {

	/**
	 * Get Role by Id
	 * 
	 * @param idRole
	 * @return RoleEntity
	 */
	RoleEntity getRoleById(Long idRole);

	/**
	 * get all role
	 *
	 * @return List<RoleEntity>
	 */
	List<RoleEntity> getAllRoles();

	/**
	 * add role
	 *
	 * @param RoleDto
	 * @return RoleEntity
	 */
	RoleEntity addRole(RoleDto roleDto);

	/**
	 * update role
	 *
	 * @param RoleDto
	 * @return RoleEntity
	 */
	RoleEntity updateRole(RoleDto roleDto);

	/**
	 * delete role
	 *
	 * @param id role
	 * @return RoleEntity
	 */
	void deleteRole(Long idRole);

}
