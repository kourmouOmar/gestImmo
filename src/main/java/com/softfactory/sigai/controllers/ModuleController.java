package com.softfactory.sigai.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
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
public class ModuleController {

	@Autowired
	private ModuleService ModuleService;

	@RequestMapping("/modules")
	@PreAuthorize("hasRole('"+AuthoritiesConstants.ADMIN+"')")
	public SigaiResponse getAllModules() {
		/* get all Module */
		return new SigaiResponse(ModuleService.getAllModules(), HttpStatus.OK);
	}

	@RequestMapping("/modules/{id}")
	public SigaiResponse getModuleById(@PathVariable Long id) {
		/* return Module by id */
		return new SigaiResponse(ModuleService.getModuleById(id), HttpStatus.OK);
	}

	@PostMapping("/modules/{id}")
	public SigaiResponse addModule(@RequestBody ModuleDto ModuleDto) {
		/* add Module */
		return new SigaiResponse(ModuleService.addModule(ModuleDto), HttpStatus.OK);
	}

	@PutMapping("/modules/{id}")
	public SigaiResponse updateModule(@RequestBody ModuleDto ModuleDto) {
		/* update Module */
		return new SigaiResponse(ModuleService.updateModule(ModuleDto), HttpStatus.OK);
	}

	@DeleteMapping("/module/{id}")
	public SigaiResponse deleteModule(@PathVariable Long id) {
		/* delete Module */
		ModuleService.deleteModule(id);
		return new SigaiResponse(HttpStatus.OK);
	}

}
