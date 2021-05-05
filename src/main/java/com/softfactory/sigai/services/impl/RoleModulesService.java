/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.service.impl;
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
	RoleModulesRepository rolemodulesRespository;
	
	@Override
	public RoleModulesEntity getRoleModulesById(Long idRole) {
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
		return rolemodulesRespository.save(RoleModulesDto.dtoToEntity(RoleModulesDto));
	}

	@Override
	public RoleModulesEntity updateRoleModules(RoleModulesDto rolemodulesDto) {
		/* update RoleModules*/
		return rolemodulesRespository.save(RoleModulesDto.dtoToEntity(RoleModulesDto));
	}

	@Override
	public void deleteRoleModules(Long idRoleModules) {
		/* delete RoleModules*/
		rolemodulesRespository.deleteById(idRoleModules);
	}
}