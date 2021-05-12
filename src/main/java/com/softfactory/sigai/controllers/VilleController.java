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
import com.softfactory.sigai.controllers.dto.VilleDto;
import com.softfactory.sigai.services.IVilleService;
import com.softfactory.sigai.util.Constants;

/**
 * Spring controller "Ville"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */
@RestController
@RequestMapping("/villes")
public class VilleController {

	@Autowired
	private IVilleService VilleService;

	@GetMapping(value = "/v0", headers = Constants.HEADERS)
	@PreAuthorize("hasRole('" + AuthoritiesConstants.GET_ALL_VILLE + "')")
	public SigaiResponse getAllVilles() {
		/* get all Ville */
		return new SigaiResponse(VilleService.getAllVilles(), HttpStatus.OK);
	}

	@GetMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	@PreAuthorize("hasRole('" + AuthoritiesConstants.GET_VILLE_BY_ID + "')")
	public SigaiResponse getVilleById(@PathVariable Long id) {
		/* return Ville by id */
		return new SigaiResponse(VilleService.getVilleById(id), HttpStatus.OK);
	}

	@PostMapping(value = "/v0", headers = Constants.HEADERS)
	@PreAuthorize("hasRole('" + AuthoritiesConstants.SAVE_VILLE + "')")
	public SigaiResponse addVille(@RequestBody VilleDto VilleDto) {
		/* add Ville */
		return new SigaiResponse(VilleService.addVille(VilleDto), HttpStatus.OK);
	}

	@PutMapping(value = "/v0", headers = Constants.HEADERS)
	@PreAuthorize("hasRole('" + AuthoritiesConstants.UPDATE_VILLE + "')")
	public SigaiResponse updateVille(@RequestBody VilleDto VilleDto) {
		/* update Ville */
		return new SigaiResponse(VilleService.updateVille(VilleDto), HttpStatus.OK);
	}

	@DeleteMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	@PreAuthorize("hasRole('" + AuthoritiesConstants.DELETE_VILLE + "')")
	public SigaiResponse deleteVille(@PathVariable Long id) {
		/* delete Ville */
		VilleService.deleteVille(id);
		return new SigaiResponse(HttpStatus.OK);
	}

}
