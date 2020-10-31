package com.softfactory.sigai.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softfactory.sigai.entities.RoleEntity;
import com.softfactory.sigai.repository.RoleRepository;
import com.softfactory.sigai.services.IRoleService;

@Service
public class RoleService implements IRoleService {
	@Autowired
	RoleRepository roleRespository;
	
	@Override
	public RoleEntity getRoleEntityById(Long idRole) {
		return roleRespository.getRoleBydId(idRole);
	}

}
