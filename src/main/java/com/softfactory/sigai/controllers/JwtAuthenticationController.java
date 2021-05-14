package com.softfactory.sigai.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.softfactory.sigai.config.JwtTokenUtil;
import com.softfactory.sigai.config.SigaiResponse;
import com.softfactory.sigai.config.TokenProvider;
import com.softfactory.sigai.controllers.dto.JwtResponseDto;
import com.softfactory.sigai.entities.JwtRequest;
import com.softfactory.sigai.entities.UtilisateurEntity;
import com.softfactory.sigai.services.IJwtService;
import com.softfactory.sigai.services.JwtUserDetailsServices;
import com.softfactory.sigai.util.Constants;
import com.softfactory.sigai.util.Functions;

@RestController
public class JwtAuthenticationController {
	private static final String HEADERS = "Accept=application/json";

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtTokenUtil jwtTokenUtil;

	@Autowired
	private TokenProvider tokenProvider;

	@Autowired
	private IJwtService jwtService;

	@Autowired
	private JwtUserDetailsServices userDetailsService;

	private static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";

	@RequestMapping(value = "/auth", method = RequestMethod.POST)
	public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest) throws Exception {
		authenticate(authenticationRequest.getUsername(), authenticationRequest.getPassword());
		final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());
		/* full Name */
		String fullName = authenticationRequest.getUsername();
		/* authorities */
		List<GrantedAuthority> authorities = new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority("Admin"));
		/* authorites */

		String token = tokenProvider.createToken(fullName, authorities, new Date());
		// final String token = jwtTokenUtil.generateToken(userDetails);
		/* construit response */
		JwtResponseDto response = new JwtResponseDto();
		response.setHeader(tokenProvider.getHeader());
		response.setToken(token);
		response.setExpires(Functions.formatDate(tokenProvider.getExpirationTime(new Date()), DATE_FORMAT));
		return ResponseEntity.ok(response);
	}

	private void authenticate(String username, String password) throws Exception {
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
		} catch (DisabledException e) {
			throw new Exception("USER_DISABLED", e);
		} catch (BadCredentialsException e) {
			throw new Exception("INVALID_CREDENTIALS", e);
		}
	}

	/**
	 * Login and generate token & refresh token token v1
	 * 
	 * @return
	 * @throws Exception
	 */
	@PostMapping(value = "/v1/auth", headers = HEADERS)
	public SigaiResponse login1() throws Exception {
		System.out.println("debut auth");
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
			/* get permission authorities */
			Set<String> authorities = jwtService.getAuthorities(user);
			/** */
			
			Set<GrantedAuthority> grantedAuthorities = jwtService.constructGrantedAuthorities(authorities);
			/* construct response */
			sigaiResponse = new SigaiResponse(jwtService.constructResponse(user, username, grantedAuthorities),
					HttpStatus.OK);
		}
		return sigaiResponse;
	}

	@PostMapping(value = "/v0/test", headers = Constants.HEADERS)
	public SigaiResponse test() {

		System.out.println("debut auth");
		String username = SecurityContextHolder.getContext().getAuthentication().getName();
		System.out.println("username : " + username);

		return new SigaiResponse("this is working !", HttpStatus.OK);
	}
}
