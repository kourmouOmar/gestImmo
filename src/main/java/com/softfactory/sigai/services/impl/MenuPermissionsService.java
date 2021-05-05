/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.service.impl;
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
	MenuPermissionsRepository menupermissionsRespository;
	
	@Override
	public MenuPermissionsEntity getMenuPermissionsById(Long idRole) {
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
		return menupermissionsRespository.save(MenuPermissionsDto.dtoToEntity(MenuPermissionsDto));
	}

	@Override
	public MenuPermissionsEntity updateMenuPermissions(MenuPermissionsDto menupermissionsDto) {
		/* update MenuPermissions*/
		return menupermissionsRespository.save(MenuPermissionsDto.dtoToEntity(MenuPermissionsDto));
	}

	@Override
	public void deleteMenuPermissions(Long idMenuPermissions) {
		/* delete MenuPermissions*/
		menupermissionsRespository.deleteById(idMenuPermissions);
	}
}