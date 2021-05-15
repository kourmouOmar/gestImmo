package com.softfactory.sigai.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softfactory.sigai.config.SigaiResponse;
import com.softfactory.sigai.controllers.dto.MenusAuthoritiesDto;
import com.softfactory.sigai.entities.UtilisateurEntity;
import com.softfactory.sigai.services.IJwtService;

@RestController
public class JwtAuthenticationController {

	private static final String HEADERS = "Accept=application/json";

	@Autowired
	private IJwtService jwtService;

	/**
	 * Login and generate token & refresh token token v1
	 * 
	 * @return
	 * @throws Exception
	 */
	@PostMapping(value = "/v1/auth", headers = HEADERS)
	public SigaiResponse login(){
		String username = SecurityContextHolder.getContext().getAuthentication().getName();
		UtilisateurEntity user = null;
		SigaiResponse sigaiResponse = null;

		try {
			/* Roles */
			user = jwtService.getUserByUsername(username);
		} catch (DataAccessException e) {
			new SigaiResponse(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		if (user == null) {
			sigaiResponse = new SigaiResponse(HttpStatus.UNAUTHORIZED);
		} else {
			MenusAuthoritiesDto menusAuthoritiesDto = jwtService.getAuthoritiesAndMenus(user);

			/* construct response */
			sigaiResponse = new SigaiResponse(jwtService.constructResponse(user, username, menusAuthoritiesDto),
					HttpStatus.OK);
		}
		return sigaiResponse;
	}
}
