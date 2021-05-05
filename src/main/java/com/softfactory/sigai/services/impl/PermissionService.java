/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softfactory.sigai.controllers.dto.PermissionDto;
import com.softfactory.sigai.entities.PermissionEntity;
import com.softfactory.sigai.repository.IPermissionRepository;
import com.softfactory.sigai.services.IPermissionService;

/**
 * Spring serviceImpl "Permission"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */

@Service
public class PermissionService implements IPermissionService {
	
	@Autowired
	IPermissionRepository permissionRespository;
	
	@Override
	public PermissionEntity getPermissionById(Long idPermission) {
		return permissionRespository.getPermissionBydId(idPermission);
	}

	@Override
	public List<PermissionEntity> getAllPermissions() {
		/* get all Permission*/
		return permissionRespository.findAll();
	}

	@Override
	public PermissionEntity addPermission(PermissionDto permissionDto) {
		/* add Permission */
		return permissionRespository.save(PermissionDto.dtoToEntity(permissionDto));
	}

	@Override
	public PermissionEntity updatePermission(PermissionDto permissionDto) {
		/* update Permission*/
		return permissionRespository.save(PermissionDto.dtoToEntity(permissionDto));
	}

	@Override
	public void deletePermission(Long idPermission) {
		/* delete Permission*/
		permissionRespository.deleteById(idPermission);
	}
}