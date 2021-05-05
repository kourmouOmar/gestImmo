/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softfactory.sigai.controllers.dto.MenuDto;
import com.softfactory.sigai.entities.MenuEntity;
import com.softfactory.sigai.repository.IMenuRepository;
import com.softfactory.sigai.services.IMenuService;

/**
 * Spring serviceImpl "Menu"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */

@Service
public class MenuService implements IMenuService {
	
	@Autowired
	IMenuRepository menuRespository;
	
	@Override
	public MenuEntity getMenuById(Long idMenu) {
		return menuRespository.getMenuBydId(idMenu);
	}

	@Override
	public List<MenuEntity> getAllMenus() {
		/* get all Menu*/
		return menuRespository.findAll();
	}

	@Override
	public MenuEntity addMenu(MenuDto menuDto) {
		/* add Menu */
		return menuRespository.save(MenuDto.dtoToEntity(menuDto));
	}

	@Override
	public MenuEntity updateMenu(MenuDto menuDto) {
		/* update Menu*/
		return menuRespository.save(MenuDto.dtoToEntity(menuDto));
	}

	@Override
	public void deleteMenu(Long idMenu) {
		/* delete Menu*/
		menuRespository.deleteById(idMenu);
	}
}