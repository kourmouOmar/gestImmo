/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.services;

import java.util.List;

import com.softfactory.sigai.controllers.dto.RoleMenusDto;
import com.softfactory.sigai.entities.RoleMenusEntity;

/**
 * Spring service "RoleMenus"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */
public interface IRoleMenusService{

/**
	 * Get RoleMenus by Id
	 * 
	 * @param idRoleMenus
	 * @return RoleMenusEntity
	 */
	RoleMenusEntity getRoleMenusById(Long idRoleMenus);

	/**
	 * get all RoleMenus
	 *
	 * @return List<RoleMenusEntity>
	 */
	List<RoleMenusEntity> getAllRoleMenuss();

	/**
	 * add RoleMenus
	 *
	 * @param RoleMenusDto
	 * @return RoleMenusEntity
	 */
	RoleMenusEntity addRoleMenus(RoleMenusDto RoleMenusDto);

	/**
	 * update RoleMenus
	 *
	 * @param RoleMenusDto
	 * @return RoleMenusEntity
	 */
	RoleMenusEntity updateRoleMenus(RoleMenusDto RoleMenusDto);

	/**
	 * delete RoleMenus
	 *
	 * @param idRoleMenus
	 * @return RoleMenusEntity
	 */
	void deleteRoleMenus(Long idRoleMenus);

}