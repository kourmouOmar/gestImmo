package com.softfactory.sigai.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.softfactory.sigai.entities.RoleEntity;
import com.softfactory.sigai.repository.RoleRepository;

@RestController
public class RoleController {
	
	@Autowired
	private RoleRepository roleRepo;
	
	@RequestMapping("/roles")
	public Iterable<RoleEntity> getRoles() 
	{
		return roleRepo.findAll();
	}
	
	@RequestMapping("/roles/{id}")
	public Optional<RoleEntity> getRole(@PathVariable Long id) 
	{
		return roleRepo.findById(id);
	}
	
	@RequestMapping( method = RequestMethod.POST, value = "/roles")
	public void addRole(@RequestBody RoleEntity role) 
	{
		roleRepo.save(role);
	}
	
	@RequestMapping( method = RequestMethod.PUT, value = "/roles/{id}")
	public void modifyRole(@RequestBody RoleEntity role,@PathVariable Long id) 
	{
		roleRepo.save(role);
	}
	
	@RequestMapping( method = RequestMethod.DELETE, value = "/roles/{id}")
	public void deleteRole(@PathVariable Long id) 
	{
		roleRepo.deleteById(id);
	}

}
