/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.service;
/**
 * Spring service "Menu"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */
public interface IMenuService{

/**
	 * Get Menu by Id
	 * 
	 * @param idMenu
	 * @return MenuEntity
	 */
	MenuEntity getMenuById(Long idMenu);

	/**
	 * get all Menu
	 *
	 * @return List<MenuEntity>
	 */
	List<MenuEntity> getAllMenus();

	/**
	 * add Menu
	 *
	 * @param MenuDto
	 * @return MenuEntity
	 */
	MenuEntity addMenu(MenuDto MenuDto);

	/**
	 * update Menu
	 *
	 * @param MenuDto
	 * @return MenuEntity
	 */
	MenuEntity updateMenu(MenuDto MenuDto);

	/**
	 * delete Menu
	 *
	 * @param idMenu
	 * @return MenuEntity
	 */
	void deleteMenu(Long idMenu);

}