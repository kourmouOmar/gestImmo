package com.softfactory.sigai.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softfactory.sigai.controllers.dto.RoleDto;
import com.softfactory.sigai.entities.RoleEntity;
import com.softfactory.sigai.repository.RoleRepository;
import com.softfactory.sigai.services.IRoleService;

/**
 * Spring service "User"
 * 
 * @author : kourmou Omar
 * @creation : 31/10/20
 * @version : 1.0
 */

@Service
public class RoleService implements IRoleService {
	
	@Autowired
	RoleRepository roleRespository;
	
	@Override
	public RoleEntity getRoleById(Long idRole) {
		return roleRespository.getRoleBydId(idRole);
	}

	@Override
	public List<RoleEntity> getAllRoles() {
		/* get all role*/
		return roleRespository.findAll();
	}

	@Override
	public RoleEntity addRole(RoleDto roleDto) {
		/* add role */
		return roleRespository.save(RoleDto.dtoToEntity(roleDto));
	}

	@Override
	public RoleEntity updateRole(RoleDto roleDto) {
		/* update role*/
		return roleRespository.save(RoleDto.dtoToEntity(roleDto));
	}

	@Override
	public void deleteRole(Long idRole) {
		/* delete role*/
		roleRespository.deleteById(idRole);
	}

}
