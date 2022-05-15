package com.softfactory.sigai.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softfactory.sigai.config.SigaiResponse;
import com.softfactory.sigai.controllers.dto.UtilisateurDto;
import com.softfactory.sigai.services.IUserService;
import com.softfactory.sigai.util.Constants;

/**
 * spring controller user
 * 
 * @author omarkourmou1
 * @creation : 13/05/22
 * @version : 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService userservice;

	@GetMapping(value = "/v0", headers = Constants.HEADERS)
	public SigaiResponse getAllUsers() {
		/* get all Ville */
		return new SigaiResponse(UtilisateurDto.entitiesToDtos(userservice.getAllUsers()), HttpStatus.OK);
	}

	@GetMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	public SigaiResponse getUserById(@PathVariable Long id) {
		/* return user by id */
		return new SigaiResponse(userservice.getUserById(id), HttpStatus.OK);
	}

	@PostMapping(value = "/v0", headers = Constants.HEADERS)
	public SigaiResponse addUser(@RequestBody UtilisateurDto userDto) {

		/* add user */
		return new SigaiResponse(userservice.addUser(userDto), HttpStatus.OK);
	}

	@PutMapping(value = "/v0", headers = Constants.HEADERS)
	public SigaiResponse updateUser(@RequestBody UtilisateurDto userDto) {
		/* update user */
		return new SigaiResponse(userservice.updateUser(userDto), HttpStatus.OK);
	}

	@DeleteMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	public SigaiResponse deleteUser(@PathVariable Long id) {
		/* delete user */
		userservice.deleteUser(id);
		return new SigaiResponse(HttpStatus.OK);
	}

}
