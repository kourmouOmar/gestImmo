/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.softfactory.sigai.controllers.dto.UtilisateurDto;
import com.softfactory.sigai.controllers.dto.UtilisateurRolesDto;
import com.softfactory.sigai.entities.UtilisateurEntity;
import com.softfactory.sigai.repository.IUtilisateurRepository;
import com.softfactory.sigai.services.IUserService;

/**
 * spring service UserService
 * 
 * @author omarkourmou1
 *
 */

@Service
public class UserService implements IUserService {

	@Autowired
	IUtilisateurRepository utilisateurRepository;

	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public UtilisateurEntity getUserById(Long iduser) {
		return utilisateurRepository.findUtilisateurById(iduser);
	}

	@Override
	public List<UtilisateurEntity> getAllUsers() {
		return utilisateurRepository.findAll();
	}

	@Override
	public UtilisateurEntity addUser(UtilisateurDto userDto) {
		List<UtilisateurRolesDto> listOfUtilisateurRolesDto = new ArrayList<>();
		UtilisateurRolesDto p = new UtilisateurRolesDto();
		p.setRoleDto(userDto.getRoleDto());
		p.setUtilisateurDto(userDto);
		listOfUtilisateurRolesDto.add(p);
		userDto.setListOfUtilisateurRolesDto(listOfUtilisateurRolesDto);

		String pswd = bCryptPasswordEncoder.encode(userDto.getPassword());
		userDto.setPassword(pswd);
		UtilisateurEntity user = utilisateurRepository.save(UtilisateurDto.dtoToEntity(userDto));
		return user;

	}

	@Override
	public UtilisateurEntity updateUser(UtilisateurDto userDto) {

		return utilisateurRepository.save(UtilisateurDto.dtoToEntity(userDto));
	}

	@Override
	public void deleteUser(Long iduser) {
		utilisateurRepository.deleteById(iduser);
		;

	}

}