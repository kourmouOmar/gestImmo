/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.service.impl;
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
	RolePermissionsRepository rolepermissionsRespository;
	
	@Override
	public RolePermissionsEntity getRolePermissionsById(Long idRole) {
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
		return rolepermissionsRespository.save(RolePermissionsDto.dtoToEntity(RolePermissionsDto));
	}

	@Override
	public RolePermissionsEntity updateRolePermissions(RolePermissionsDto rolepermissionsDto) {
		/* update RolePermissions*/
		return rolepermissionsRespository.save(RolePermissionsDto.dtoToEntity(RolePermissionsDto));
	}

	@Override
	public void deleteRolePermissions(Long idRolePermissions) {
		/* delete RolePermissions*/
		rolepermissionsRespository.deleteById(idRolePermissions);
	}
}