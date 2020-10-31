package com.softfactory.sigai.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softfactory.sigai.config.SigaiResponse;
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
	
	@GetMapping(value = "/users")
	public SigaiResponse getAllUsers() {
		return new SigaiResponse(userService.getAllUser(),HttpStatus.OK);
	}
}
