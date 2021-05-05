/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softfactory.sigai.controllers.dto.RoleMenusPermissionsDto;
import com.softfactory.sigai.entities.RoleMenusPermissionsEntity;
import com.softfactory.sigai.repository.IRoleMenusPermissionsRepository;
import com.softfactory.sigai.services.IRoleMenusPermissionsService;

/**
 * Spring serviceImpl "RoleMenusPermissions"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */

@Service
public class RoleMenusPermissionsService implements IRoleMenusPermissionsService {
	
	@Autowired
	IRoleMenusPermissionsRepository rolemenuspermissionsRespository;
	
	@Override
	public RoleMenusPermissionsEntity getRoleMenusPermissionsById(Long idRoleMenusPermissions) {
		return rolemenuspermissionsRespository.getRoleMenusPermissionsBydId(idRoleMenusPermissions);
	}

	@Override
	public List<RoleMenusPermissionsEntity> getAllRoleMenusPermissionss() {
		/* get all RoleMenusPermissions*/
		return rolemenuspermissionsRespository.findAll();
	}

	@Override
	public RoleMenusPermissionsEntity addRoleMenusPermissions(RoleMenusPermissionsDto rolemenuspermissionsDto) {
		/* add RoleMenusPermissions */
		return rolemenuspermissionsRespository.save(RoleMenusPermissionsDto.dtoToEntity(rolemenuspermissionsDto));
	}

	@Override
	public RoleMenusPermissionsEntity updateRoleMenusPermissions(RoleMenusPermissionsDto rolemenuspermissionsDto) {
		/* update RoleMenusPermissions*/
		return rolemenuspermissionsRespository.save(RoleMenusPermissionsDto.dtoToEntity(rolemenuspermissionsDto));
	}

	@Override
	public void deleteRoleMenusPermissions(Long idRoleMenusPermissions) {
		/* delete RoleMenusPermissions*/
		rolemenuspermissionsRespository.deleteById(idRoleMenusPermissions);
	}
}