/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softfactory.sigai.controllers.dto.RoleMenusDto;
import com.softfactory.sigai.entities.RoleMenusEntity;
import com.softfactory.sigai.repository.IRoleMenusRepository;
import com.softfactory.sigai.services.IRoleMenusService;

/**
 * Spring serviceImpl "RoleMenus"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */

@Service
public class RoleMenusService implements IRoleMenusService {
	
	@Autowired
	IRoleMenusRepository rolemenusRespository;
	
	@Override
	public RoleMenusEntity getRoleMenusById(Long idRoleMenus) {
		return rolemenusRespository.getRoleMenusBydId(idRoleMenus);
	}

	@Override
	public List<RoleMenusEntity> getAllRoleMenuss() {
		/* get all RoleMenus*/
		return rolemenusRespository.findAll();
	}

	@Override
	public RoleMenusEntity addRoleMenus(RoleMenusDto rolemenusDto) {
		/* add RoleMenus */
		return rolemenusRespository.save(RoleMenusDto.dtoToEntity(rolemenusDto));
	}

	@Override
	public RoleMenusEntity updateRoleMenus(RoleMenusDto rolemenusDto) {
		/* update RoleMenus*/
		return rolemenusRespository.save(RoleMenusDto.dtoToEntity(rolemenusDto));
	}

	@Override
	public void deleteRoleMenus(Long idRoleMenus) {
		/* delete RoleMenus*/
		rolemenusRespository.deleteById(idRoleMenus);
	}
}