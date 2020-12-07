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
import com.softfactory.sigai.controllers.dto.VilleDto;
import com.softfactory.sigai.services.IVilleService;

/**
 * Spring controller "Ville"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */
@RestController
public class VilleController {

	@Autowired
	private IVilleService VilleService;

	@GetMapping("/villes")
	@PreAuthorize("hasRole('"+AuthoritiesConstants.ADMIN+"')")
	public SigaiResponse getAllVilles() {
		/* get all Ville */
		return new SigaiResponse(VilleService.getAllVilles(), HttpStatus.OK);
	}

	@GetMapping("/villes/{id}")
	public SigaiResponse getVilleById(@PathVariable Long id) {
		/* return Ville by id */
		return new SigaiResponse(VilleService.getVilleById(id), HttpStatus.OK);
	}

	@PostMapping("/villes/{id}")
	public SigaiResponse addVille(@RequestBody VilleDto VilleDto) {
		/* add Ville */
		return new SigaiResponse(VilleService.addVille(VilleDto), HttpStatus.OK);
	}

	@PutMapping("/villes/{id}")
	public SigaiResponse updateVille(@RequestBody VilleDto VilleDto) {
		/* update Ville */
		return new SigaiResponse(VilleService.updateVille(VilleDto), HttpStatus.OK);
	}

	@DeleteMapping("/ville/{id}")
	public SigaiResponse deleteVille(@PathVariable Long id) {
		/* delete Ville */
		VilleService.deleteVille(id);
		return new SigaiResponse(HttpStatus.OK);
	}

}
