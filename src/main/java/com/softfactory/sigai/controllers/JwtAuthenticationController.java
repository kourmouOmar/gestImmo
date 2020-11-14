package com.softfactory.sigai.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.softfactory.sigai.config.JwtTokenUtil;
import com.softfactory.sigai.config.TokenProvider;
import com.softfactory.sigai.controllers.dto.JwtResponseDto;
import com.softfactory.sigai.entities.JwtRequest;
import com.softfactory.sigai.entities.JwtResponse;
import com.softfactory.sigai.services.JwtUserDetailsServices;
import com.softfactory.sigai.util.Functions;

import javassist.expr.NewArray;

@RestController
public class JwtAuthenticationController {
	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtTokenUtil jwtTokenUtil;
	
	@Autowired
	private TokenProvider tokenProvider;

	@Autowired
	private JwtUserDetailsServices userDetailsService;

	private static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";

	@RequestMapping(value = "/auth", method = RequestMethod.POST)
	public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest) throws Exception {
		
		authenticate( authenticationRequest.getUsername(),authenticationRequest.getPassword());

		final UserDetails userDetails = userDetailsService.loadUserByUsername( authenticationRequest.getUsername());
		/*full Name*/
		String fullName = authenticationRequest.getUsername();
		/* authorities */
		List<GrantedAuthority> authorities = new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority("Admin"));
		String token = tokenProvider.createToken(fullName, authorities, new Date());
		//final String token = jwtTokenUtil.generateToken(userDetails);
		/* construit response*/
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
}
