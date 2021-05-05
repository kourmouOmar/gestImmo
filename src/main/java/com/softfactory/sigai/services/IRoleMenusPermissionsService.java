/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.service;
/**
 * Spring service "RoleMenusPermissions"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */
public interface IRoleMenusPermissionsService{

/**
	 * Get RoleMenusPermissions by Id
	 * 
	 * @param idRoleMenusPermissions
	 * @return RoleMenusPermissionsEntity
	 */
	RoleMenusPermissionsEntity getRoleMenusPermissionsById(Long idRoleMenusPermissions);

	/**
	 * get all RoleMenusPermissions
	 *
	 * @return List<RoleMenusPermissionsEntity>
	 */
	List<RoleMenusPermissionsEntity> getAllRoleMenusPermissionss();

	/**
	 * add RoleMenusPermissions
	 *
	 * @param RoleMenusPermissionsDto
	 * @return RoleMenusPermissionsEntity
	 */
	RoleMenusPermissionsEntity addRoleMenusPermissions(RoleMenusPermissionsDto RoleMenusPermissionsDto);

	/**
	 * update RoleMenusPermissions
	 *
	 * @param RoleMenusPermissionsDto
	 * @return RoleMenusPermissionsEntity
	 */
	RoleMenusPermissionsEntity updateRoleMenusPermissions(RoleMenusPermissionsDto RoleMenusPermissionsDto);

	/**
	 * delete RoleMenusPermissions
	 *
	 * @param idRoleMenusPermissions
	 * @return RoleMenusPermissionsEntity
	 */
	void deleteRoleMenusPermissions(Long idRoleMenusPermissions);

}