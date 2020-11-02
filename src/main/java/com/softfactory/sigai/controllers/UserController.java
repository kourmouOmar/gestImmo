package com.softfactory.sigai.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.softfactory.sigai.config.SigaiResponse;
import com.softfactory.sigai.controllers.dto.UserDto;
import com.softfactory.sigai.services.impl.UserService;

/**
 * Spring controller "User"
 * 
 * @author : kourmou Omar
 * @creation : 31/10/20
 * @version : 1.0
 */
@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@Autowired
	UserDetailsService userDetailsService;
	
	@GetMapping(value = "/users")
	public SigaiResponse getAllUsers() {
		/* get all users */
		return new SigaiResponse(userService.getAllUser(),HttpStatus.OK);
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public SigaiResponse saveUser(@RequestBody UserDto user) throws Exception {	
		/* save user*/
		return new SigaiResponse(userService.saveUser(user),HttpStatus.OK);
	}
}
