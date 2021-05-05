/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.service.impl;
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
	RoleRepository roleRespository;
	
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
		return roleRespository.save(RoleDto.dtoToEntity(RoleDto));
	}

	@Override
	public RoleEntity updateRole(RoleDto roleDto) {
		/* update Role*/
		return roleRespository.save(RoleDto.dtoToEntity(RoleDto));
	}

	@Override
	public void deleteRole(Long idRole) {
		/* delete Role*/
		roleRespository.deleteById(idRole);
	}
}