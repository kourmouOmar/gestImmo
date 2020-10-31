package com.softfactory.sigai.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softfactory.sigai.entities.UserEntity;
import com.softfactory.sigai.repository.UserRepository;
import com.softfactory.sigai.services.IUserService;


@Service
public class UserService  implements IUserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public List<UserEntity> getAllUser() {
		List<UserEntity> listUser = userRepository.getAllUsers();
		return listUser;
	}

}
