package com.softfactory.sigai.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.softfactory.sigai.controllers.dto.UserDto;
import com.softfactory.sigai.entities.UserEntity;
import com.softfactory.sigai.repository.UserRepository;
import com.softfactory.sigai.services.IUserService;


@Service
public class UserService  implements IUserService{

	@Autowired
	UserRepository userRepository;
	
	@Autowired(required=true)
	private RoleService roleService;
	
	@Autowired(required=true)
	private PasswordEncoder bcryptEncoder;
	
	@Override
	public List<UserEntity> getAllUser() {
		List<UserEntity> listUser = userRepository.getAllUsers();
		return listUser;
	}
	@Override
	public UserEntity saveUser(UserDto user) {
		UserEntity newUser = new UserEntity();
		newUser.setUsername(user.getUsername());
		newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
		newUser.setRole(roleService.getRoleById(user.getRole().getId()));
		return userRepository.save(newUser);
	}
	@Override
	public UserEntity getAllUserById(Long idUser) {
		UserEntity userEntity = userRepository.findUserById(idUser);
		return userEntity;
	}
	

}
