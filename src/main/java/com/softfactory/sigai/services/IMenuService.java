package com.softfactory.sigai.services;

import java.util.List;

import com.softfactory.sigai.controllers.dto.MenuDto;
import com.softfactory.sigai.entities.MenuEntity;

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