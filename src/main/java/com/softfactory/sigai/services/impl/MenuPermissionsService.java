/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softfactory.sigai.controllers.dto.MenuPermissionsDto;
import com.softfactory.sigai.entities.MenuPermissionsEntity;
import com.softfactory.sigai.repository.IMenuPermissionsRepository;
import com.softfactory.sigai.services.IMenuPermissionsService;

/**
 * Spring serviceImpl "MenuPermissions"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */

@Service
public class MenuPermissionsService implements IMenuPermissionsService {
	
	@Autowired
	IMenuPermissionsRepository menupermissionsRespository;
	
	@Override
	public MenuPermissionsEntity getMenuPermissionsById(Long idMenuPermissions) {
		return menupermissionsRespository.getMenuPermissionsBydId(idMenuPermissions);
	}

	@Override
	public List<MenuPermissionsEntity> getAllMenuPermissionss() {
		/* get all MenuPermissions*/
		return menupermissionsRespository.findAll();
	}

	@Override
	public MenuPermissionsEntity addMenuPermissions(MenuPermissionsDto menupermissionsDto) {
		/* add MenuPermissions */
		return menupermissionsRespository.save(MenuPermissionsDto.dtoToEntity(menupermissionsDto));
	}

	@Override
	public MenuPermissionsEntity updateMenuPermissions(MenuPermissionsDto menupermissionsDto) {
		/* update MenuPermissions*/
		return menupermissionsRespository.save(MenuPermissionsDto.dtoToEntity(menupermissionsDto));
	}

	@Override
	public void deleteMenuPermissions(Long idMenuPermissions) {
		/* delete MenuPermissions*/
		menupermissionsRespository.deleteById(idMenuPermissions);
	}
}