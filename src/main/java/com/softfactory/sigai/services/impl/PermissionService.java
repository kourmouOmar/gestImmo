/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.service.impl;
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
	PermissionRepository permissionRespository;
	
	@Override
	public PermissionEntity getPermissionById(Long idRole) {
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
		return permissionRespository.save(PermissionDto.dtoToEntity(PermissionDto));
	}

	@Override
	public PermissionEntity updatePermission(PermissionDto permissionDto) {
		/* update Permission*/
		return permissionRespository.save(PermissionDto.dtoToEntity(PermissionDto));
	}

	@Override
	public void deletePermission(Long idPermission) {
		/* delete Permission*/
		permissionRespository.deleteById(idPermission);
	}
}