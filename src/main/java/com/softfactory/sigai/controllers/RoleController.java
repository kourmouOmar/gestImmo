package com.softfactory.sigai.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.softfactory.sigai.config.AuthoritiesConstants;
import com.softfactory.sigai.config.SigaiResponse;
import com.softfactory.sigai.controllers.dto.RoleDto;
import com.softfactory.sigai.services.impl.RoleService;
import com.softfactory.sigai.util.Constants;

/**
 * Spring controller "Role"
 * 
 * @author : illass elbarhoumi
 * @creation : 31/10/20
 * @version : 1.0
 */
@RestController
public class RoleController {

	@Autowired
	private RoleService roleService;

	@GetMapping(value = "/roles", headers = Constants.HEADERS)
	@PreAuthorize("hasRole('" + AuthoritiesConstants.GET_ALL_ROLE + "')")
	public SigaiResponse getAllRoles() {
		/* get all role */
		return new SigaiResponse(roleService.getAllRoles(), HttpStatus.OK);
	}

	@GetMapping(value = "/roles/{id}", headers = Constants.HEADERS)
	@PreAuthorize("hasRole('" + AuthoritiesConstants.GET_ROLE_BY_ID + "')")
	public SigaiResponse getRoleById(@PathVariable Long id) {
		/* return role by id */
		return new SigaiResponse(roleService.getRoleById(id), HttpStatus.OK);
	}

	@PostMapping(value = "/roles/{id}", headers = Constants.HEADERS)
	@PreAuthorize("hasRole('" + AuthoritiesConstants.SAVE_ROLE + "')")
	public SigaiResponse addRole(@RequestBody RoleDto roleDto) {
		/* add role */
		return new SigaiResponse(roleService.addRole(roleDto), HttpStatus.OK);
	}

	@PutMapping(value = "/roles/{id}", headers = Constants.HEADERS)
	@PreAuthorize("hasRole('" + AuthoritiesConstants.UPDATE_ROLE + "')")
	public SigaiResponse updateRole(@RequestBody RoleDto roleDto) {
		/* update role */
		return new SigaiResponse(roleService.updateRole(roleDto), HttpStatus.OK);
	}

	@DeleteMapping(value = "/delete/{id}", headers = Constants.HEADERS)
	@PreAuthorize("hasRole('" + AuthoritiesConstants.DELETE_ROLE+ "')")
	public SigaiResponse deleteRole(@PathVariable Long id) {
		/* delete role */
		roleService.deleteRole(id);
		return new SigaiResponse(HttpStatus.OK);
	}

}
