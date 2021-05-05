/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.services;

import java.util.List;

import com.softfactory.sigai.controllers.dto.RoleModulesDto;
import com.softfactory.sigai.entities.RoleModulesEntity;

/**
 * Spring service "RoleModules"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */
public interface IRoleModulesService{

/**
	 * Get RoleModules by Id
	 * 
	 * @param idRoleModules
	 * @return RoleModulesEntity
	 */
	RoleModulesEntity getRoleModulesById(Long idRoleModules);

	/**
	 * get all RoleModules
	 *
	 * @return List<RoleModulesEntity>
	 */
	List<RoleModulesEntity> getAllRoleModuless();

	/**
	 * add RoleModules
	 *
	 * @param RoleModulesDto
	 * @return RoleModulesEntity
	 */
	RoleModulesEntity addRoleModules(RoleModulesDto RoleModulesDto);

	/**
	 * update RoleModules
	 *
	 * @param RoleModulesDto
	 * @return RoleModulesEntity
	 */
	RoleModulesEntity updateRoleModules(RoleModulesDto RoleModulesDto);

	/**
	 * delete RoleModules
	 *
	 * @param idRoleModules
	 * @return RoleModulesEntity
	 */
	void deleteRoleModules(Long idRoleModules);

}