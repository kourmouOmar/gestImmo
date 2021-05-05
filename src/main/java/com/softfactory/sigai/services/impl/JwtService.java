package com.softfactory.sigai.services.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import com.softfactory.sigai.config.TokenProvider;
import com.softfactory.sigai.controllers.dto.JwtResponseDto;
import com.softfactory.sigai.controllers.dto.SigaiUtilisateurDto;
import com.softfactory.sigai.entities.UserEntity;
import com.softfactory.sigai.repository.UserRepository;
import com.softfactory.sigai.services.IJwtService;
import com.softfactory.sigai.util.Functions;
/**
 * Spring serviceImpl "JwtService"
 * 
 * @author : kourmouOmar
 * @creation : 05/12/20
 * @version : 1.0
 */
@Service
public class JwtService implements IJwtService {

	private static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private TokenProvider tokenProvider;

	@Override
	public UserEntity getUserByUsername(String username) {
		UserEntity userEntity = new UserEntity();
		try {
			userEntity = userRepository.findByUsername(username);

		} catch (Exception e) {
			throw e;
		}
		return userEntity;
	}

	@Override
	public Set<GrantedAuthority> getAuthorities(UserEntity user) {
		Set<GrantedAuthority> authorities = new LinkedHashSet<>();
		try {
			authorities.add(new SimpleGrantedAuthority(user.getRole().getLibelle()));

		} catch (Exception e) {
			throw e;
		}

		return authorities;
	}

	@Override
	public SigaiUtilisateurDto constructResponse(UserEntity user, String username, Set<GrantedAuthority> authorities) {

		SigaiUtilisateurDto SigaiUtilisateurDto = new SigaiUtilisateurDto();
		try {
			/* construct full name */
			StringBuilder fullName = new StringBuilder(user.getUsername()).append(" ").append(user.getUsername());

			/* current date for token creation */
			Date now = Calendar.getInstance().getTime();

			/* Token generation */
			String token = tokenProvider.createToken(username, authorities, now);

			/* finally we construct the response */
			JwtResponseDto response = new JwtResponseDto();
			response.setHeader(tokenProvider.getHeader());
			response.setToken(tokenProvider.getPrefix() + token);
			response.setExpires(Functions.formatDate(tokenProvider.getExpirationTime(now), DATE_FORMAT));
			// response.setId(user.getId());
			// response.setIdEntite(user.getEntite().getId());

			SigaiUtilisateurDto = new SigaiUtilisateurDto(username, fullName.toString(), response);

		} catch (Exception e) {
			throw e;
		}

		return SigaiUtilisateurDto;
	}

}
