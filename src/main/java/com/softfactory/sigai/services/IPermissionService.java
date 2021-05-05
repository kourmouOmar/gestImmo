/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.service;
/**
 * Spring service "Permission"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */
public interface IPermissionService{

/**
	 * Get Permission by Id
	 * 
	 * @param idPermission
	 * @return PermissionEntity
	 */
	PermissionEntity getPermissionById(Long idPermission);

	/**
	 * get all Permission
	 *
	 * @return List<PermissionEntity>
	 */
	List<PermissionEntity> getAllPermissions();

	/**
	 * add Permission
	 *
	 * @param PermissionDto
	 * @return PermissionEntity
	 */
	PermissionEntity addPermission(PermissionDto PermissionDto);

	/**
	 * update Permission
	 *
	 * @param PermissionDto
	 * @return PermissionEntity
	 */
	PermissionEntity updatePermission(PermissionDto PermissionDto);

	/**
	 * delete Permission
	 *
	 * @param idPermission
	 * @return PermissionEntity
	 */
	void deletePermission(Long idPermission);

}