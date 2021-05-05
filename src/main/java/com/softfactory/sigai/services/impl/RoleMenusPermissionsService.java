/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.service.impl;
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
	RoleMenusPermissionsRepository rolemenuspermissionsRespository;
	
	@Override
	public RoleMenusPermissionsEntity getRoleMenusPermissionsById(Long idRole) {
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
		return rolemenuspermissionsRespository.save(RoleMenusPermissionsDto.dtoToEntity(RoleMenusPermissionsDto));
	}

	@Override
	public RoleMenusPermissionsEntity updateRoleMenusPermissions(RoleMenusPermissionsDto rolemenuspermissionsDto) {
		/* update RoleMenusPermissions*/
		return rolemenuspermissionsRespository.save(RoleMenusPermissionsDto.dtoToEntity(RoleMenusPermissionsDto));
	}

	@Override
	public void deleteRoleMenusPermissions(Long idRoleMenusPermissions) {
		/* delete RoleMenusPermissions*/
		rolemenuspermissionsRespository.deleteById(idRoleMenusPermissions);
	}
}