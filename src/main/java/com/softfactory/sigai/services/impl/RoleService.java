/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softfactory.sigai.controllers.dto.RoleDto;
import com.softfactory.sigai.entities.RoleEntity;
import com.softfactory.sigai.repository.IRoleRepository;
import com.softfactory.sigai.services.IRoleService;

/**
 * Spring serviceImpl "Role"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */

@Service
public class RoleService implements IRoleService {
	
	@Autowired
	IRoleRepository roleRespository;
	
	@Override
	public RoleEntity getRoleById(Long idRole) {
		return roleRespository.getRoleBydId(idRole);
	}

	@Override
	public List<RoleEntity> getAllRoles() {
		/* get all Role*/
		return roleRespository.findAll();
	}

	@Override
	public RoleEntity addRole(RoleDto roleDto) {
		/* add Role */
		return roleRespository.save(RoleDto.dtoToEntity(roleDto));
	}

	@Override
	public RoleEntity updateRole(RoleDto roleDto) {
		/* update Role*/
		return roleRespository.save(RoleDto.dtoToEntity(roleDto));
	}

	@Override
	public void deleteRole(Long idRole) {
		/* delete Role*/
		roleRespository.deleteById(idRole);
	}
}