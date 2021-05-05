/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softfactory.sigai.controllers.dto.RoleModulesDto;
import com.softfactory.sigai.entities.RoleModulesEntity;
import com.softfactory.sigai.repository.IRoleModulesRepository;
import com.softfactory.sigai.services.IRoleModulesService;

/**
 * Spring serviceImpl "RoleModules"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */

@Service
public class RoleModulesService implements IRoleModulesService {
	
	@Autowired
	IRoleModulesRepository rolemodulesRespository;
	
	@Override
	public RoleModulesEntity getRoleModulesById(Long idRoleModules) {
		return rolemodulesRespository.getRoleModulesBydId(idRoleModules);
	}

	@Override
	public List<RoleModulesEntity> getAllRoleModuless() {
		/* get all RoleModules*/
		return rolemodulesRespository.findAll();
	}

	@Override
	public RoleModulesEntity addRoleModules(RoleModulesDto rolemodulesDto) {
		/* add RoleModules */
		return rolemodulesRespository.save(RoleModulesDto.dtoToEntity(rolemodulesDto));
	}

	@Override
	public RoleModulesEntity updateRoleModules(RoleModulesDto rolemodulesDto) {
		/* update RoleModules*/
		return rolemodulesRespository.save(RoleModulesDto.dtoToEntity(rolemodulesDto));
	}

	@Override
	public void deleteRoleModules(Long idRoleModules) {
		/* delete RoleModules*/
		rolemodulesRespository.deleteById(idRoleModules);
	}
}