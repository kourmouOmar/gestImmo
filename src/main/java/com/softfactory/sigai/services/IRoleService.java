package com.softfactory.sigai.services;

import com.softfactory.sigai.entities.RoleEntity;

/**
 * Spring service "Role"
 * 
 * @author : kourmou Omar
 * @creation : 31/10/20
 * @version : 1.0
 */
public interface IRoleService {

	/**
	 * Get Role by Id 
	 * 
	 * @return RoleEntity
	 * @throws TestBusinessException
	 */
	RoleEntity getRoleEntityById(Long idRole);	
}
