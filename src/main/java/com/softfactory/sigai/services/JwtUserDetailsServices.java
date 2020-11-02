package com.softfactory.sigai.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.softfactory.sigai.controllers.dto.UserDto;
import com.softfactory.sigai.entities.UserEntity;
import com.softfactory.sigai.repository.UserRepository;
import com.softfactory.sigai.services.impl.RoleService;




@Service
public class JwtUserDetailsServices implements UserDetailsService{

	@Autowired(required=true)
	private UserRepository userRepository;
	
	@Autowired(required=true)
	private RoleService roleService;
	
	@Autowired(required=true)
	private PasswordEncoder bcryptEncoder;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
				
		UserEntity user = userRepository.findByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
				new ArrayList<>());
		
	}
	

	public UserEntity save(UserDto user) {
		
		UserEntity newUser = new UserEntity();
		newUser.setUsername(user.getUsername());
		newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
		newUser.setRole(roleService.getRoleById(user.getIdRole()));
		
		return userRepository.save(newUser);
	}
	
}