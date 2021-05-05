/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.services;

import java.util.List;

import com.softfactory.sigai.controllers.dto.RolePermissionsDto;
import com.softfactory.sigai.entities.RolePermissionsEntity;

/**
 * Spring service "RolePermissions"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */
public interface IRolePermissionsService{

/**
	 * Get RolePermissions by Id
	 * 
	 * @param idRolePermissions
	 * @return RolePermissionsEntity
	 */
	RolePermissionsEntity getRolePermissionsById(Long idRolePermissions);

	/**
	 * get all RolePermissions
	 *
	 * @return List<RolePermissionsEntity>
	 */
	List<RolePermissionsEntity> getAllRolePermissionss();

	/**
	 * add RolePermissions
	 *
	 * @param RolePermissionsDto
	 * @return RolePermissionsEntity
	 */
	RolePermissionsEntity addRolePermissions(RolePermissionsDto RolePermissionsDto);

	/**
	 * update RolePermissions
	 *
	 * @param RolePermissionsDto
	 * @return RolePermissionsEntity
	 */
	RolePermissionsEntity updateRolePermissions(RolePermissionsDto RolePermissionsDto);

	/**
	 * delete RolePermissions
	 *
	 * @param idRolePermissions
	 * @return RolePermissionsEntity
	 */
	void deleteRolePermissions(Long idRolePermissions);

}