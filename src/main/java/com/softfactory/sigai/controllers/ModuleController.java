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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softfactory.sigai.config.AuthoritiesConstants;
import com.softfactory.sigai.config.SigaiResponse;
import com.softfactory.sigai.controllers.dto.ModuleDto;
import com.softfactory.sigai.services.impl.ModuleService;

/**
 * Spring controller "Module"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */
@RestController
@RequestMapping("/modules")
public class ModuleController {

	@Autowired
	private ModuleService moduleService;

	@GetMapping("/v0")
	//@PreAuthorize("hasRole('" + AuthoritiesConstants.GET_ALL_MODULE + "')")
	public SigaiResponse getAllModules() {
		/* get all Module */
		return new SigaiResponse(ModuleDto.entitiesToDtos(moduleService.getAllModules()), HttpStatus.OK);
	}

	@RequestMapping("/v0/{id}")
	//@PreAuthorize("hasRole('" + AuthoritiesConstants.GET_MODULE_BY_ID + "')")
	public SigaiResponse getModuleById(@PathVariable Long id) {
		/* return Module by id */
		return new SigaiResponse(moduleService.getModuleById(id), HttpStatus.OK);
	}

	@PostMapping("/v0/{id}")
	//@PreAuthorize("hasRole('" + AuthoritiesConstants.SAVE_MODULE + "')")
	public SigaiResponse addModule(@RequestBody ModuleDto ModuleDto) {
		/* add Module */
		return new SigaiResponse(moduleService.addModule(ModuleDto), HttpStatus.OK);
	}

	@PutMapping("/v0/{id}")
	//@PreAuthorize("hasRole('" + AuthoritiesConstants.UPDATE_MODULE + "')")
	public SigaiResponse updateModule(@RequestBody ModuleDto ModuleDto) {
		/* update Module */
		return new SigaiResponse(moduleService.updateModule(ModuleDto), HttpStatus.OK);
	}

	@DeleteMapping("/v0/{id}")
	//@PreAuthorize("hasRole('" + AuthoritiesConstants.DELETE_MODULE + "')")
	public SigaiResponse deleteModule(@PathVariable Long id) {
		/* delete Module */
		moduleService.deleteModule(id);
		return new SigaiResponse(HttpStatus.OK);
	}
	
	@GetMapping("/v0/{active}/{id}")
	//@PreAuthorize("hasRole('" + AuthoritiesConstants.GET_ALL_MODULE + "')")
	public SigaiResponse activeDesactiveModule(@PathVariable boolean active,@PathVariable Long id) {
		return new SigaiResponse(ModuleDto.entityToDto(moduleService.activeDesactiveModule(active, id)), HttpStatus.OK);
	}

}
