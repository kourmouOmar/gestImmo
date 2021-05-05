/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softfactory.sigai.controllers.dto.RolePermissionsDto;
import com.softfactory.sigai.entities.RolePermissionsEntity;
import com.softfactory.sigai.repository.IRolePermissionsRepository;
import com.softfactory.sigai.services.IRolePermissionsService;

/**
 * Spring serviceImpl "RolePermissions"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */

@Service
public class RolePermissionsService implements IRolePermissionsService {
	
	@Autowired
	IRolePermissionsRepository rolepermissionsRespository;
	
	@Override
	public RolePermissionsEntity getRolePermissionsById(Long idRolePermissions) {
		return rolepermissionsRespository.getRolePermissionsBydId(idRolePermissions);
	}

	@Override
	public List<RolePermissionsEntity> getAllRolePermissionss() {
		/* get all RolePermissions*/
		return rolepermissionsRespository.findAll();
	}

	@Override
	public RolePermissionsEntity addRolePermissions(RolePermissionsDto rolepermissionsDto) {
		/* add RolePermissions */
		return rolepermissionsRespository.save(RolePermissionsDto.dtoToEntity(rolepermissionsDto));
	}

	@Override
	public RolePermissionsEntity updateRolePermissions(RolePermissionsDto rolepermissionsDto) {
		/* update RolePermissions*/
		return rolepermissionsRespository.save(RolePermissionsDto.dtoToEntity(rolepermissionsDto));
	}

	@Override
	public void deleteRolePermissions(Long idRolePermissions) {
		/* delete RolePermissions*/
		rolepermissionsRespository.deleteById(idRolePermissions);
	}
}