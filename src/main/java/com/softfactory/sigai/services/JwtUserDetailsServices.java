package com.softfactory.sigai.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.softfactory.sigai.controllers.dto.UtilisateurDto;
import com.softfactory.sigai.entities.UtilisateurEntity;
import com.softfactory.sigai.repository.IUtilisateurRepository;




@Service
public class JwtUserDetailsServices implements UserDetailsService{

	@Autowired(required=true)
	private IUtilisateurRepository utilisateurRepository;
	
	//@Autowired(required=true)
	//private RoleService roleService;
	
	@Autowired(required=true)
	private PasswordEncoder bcryptEncoder;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
				
		UtilisateurEntity user = utilisateurRepository.findUtilisateurByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
				new ArrayList<>());
		
	}
	

	public UtilisateurEntity save(UtilisateurDto user) {
		
		UtilisateurEntity newUser = new UtilisateurEntity();
		newUser.setUsername(user.getUsername());
		newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
		//newUser.setRole(roleService.getRoleById(user.getListOfUtilisateurRolesDto()));
		
		return utilisateurRepository.save(newUser);
	}
	
}