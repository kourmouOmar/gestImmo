/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.services;

import java.util.List;

import com.softfactory.sigai.controllers.dto.MenuPermissionsDto;
import com.softfactory.sigai.entities.MenuPermissionsEntity;

/**
 * Spring service "MenuPermissions"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */
public interface IMenuPermissionsService{

/**
	 * Get MenuPermissions by Id
	 * 
	 * @param idMenuPermissions
	 * @return MenuPermissionsEntity
	 */
	MenuPermissionsEntity getMenuPermissionsById(Long idMenuPermissions);

	/**
	 * get all MenuPermissions
	 *
	 * @return List<MenuPermissionsEntity>
	 */
	List<MenuPermissionsEntity> getAllMenuPermissionss();

	/**
	 * add MenuPermissions
	 *
	 * @param MenuPermissionsDto
	 * @return MenuPermissionsEntity
	 */
	MenuPermissionsEntity addMenuPermissions(MenuPermissionsDto MenuPermissionsDto);

	/**
	 * update MenuPermissions
	 *
	 * @param MenuPermissionsDto
	 * @return MenuPermissionsEntity
	 */
	MenuPermissionsEntity updateMenuPermissions(MenuPermissionsDto MenuPermissionsDto);

	/**
	 * delete MenuPermissions
	 *
	 * @param idMenuPermissions
	 * @return MenuPermissionsEntity
	 */
	void deleteMenuPermissions(Long idMenuPermissions);

}