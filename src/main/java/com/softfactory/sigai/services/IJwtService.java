package com.softfactory.sigai.services;

import java.util.Set;

import org.springframework.security.core.GrantedAuthority;

import com.softfactory.sigai.controllers.dto.SigaiUtilisateurDto;
import com.softfactory.sigai.entities.UserEntity;

/**
 * interface  "IJwtService"
 * @author Omar_kourmou
 * @see kourmou.omar@gmail.com
 * @creation 05-12-2020
 * @version 1.0
 * */
public interface IJwtService {
	
	/**
	 * find User by username
	 * 
	 * @param username
	 * @return
	 */
	UserEntity getUserByUsername(String username);

	

	/**
	 * get authorities for user
	 * 
	 * @param user
	 * @return
	 */
	Set<GrantedAuthority> getAuthorities(UserEntity user);

	/**
	 * Construct login response
	 * 
	 * @param user
	 * @param username
	 * @param authorities
	 * @return
	 */
	SigaiUtilisateurDto constructResponse(UserEntity user, String username, Set<GrantedAuthority> authorities);
}
