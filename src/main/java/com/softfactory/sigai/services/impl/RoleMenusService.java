/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.service.impl;
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
	RoleMenusRepository rolemenusRespository;
	
	@Override
	public RoleMenusEntity getRoleMenusById(Long idRole) {
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
		return rolemenusRespository.save(RoleMenusDto.dtoToEntity(RoleMenusDto));
	}

	@Override
	public RoleMenusEntity updateRoleMenus(RoleMenusDto rolemenusDto) {
		/* update RoleMenus*/
		return rolemenusRespository.save(RoleMenusDto.dtoToEntity(RoleMenusDto));
	}

	@Override
	public void deleteRoleMenus(Long idRoleMenus) {
		/* delete RoleMenus*/
		rolemenusRespository.deleteById(idRoleMenus);
	}
}