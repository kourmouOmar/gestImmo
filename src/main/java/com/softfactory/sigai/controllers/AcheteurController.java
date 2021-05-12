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
import com.softfactory.sigai.controllers.dto.AcheteurDto;
import com.softfactory.sigai.services.impl.AcheteurService;
import com.softfactory.sigai.util.Constants;

/**
 * Spring controller "Acheteur"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */
@RestController
@RequestMapping("/acheteurs")
public class AcheteurController {

	@Autowired
	private AcheteurService AcheteurService;

	@GetMapping(value = "/v0", headers = Constants.HEADERS)
	@PreAuthorize("hasRole('" + AuthoritiesConstants.GET_ALL_ACHETEUR + "')")
	public SigaiResponse getAllAcheteurs() {
		/* get all Acheteur */
		return new SigaiResponse(AcheteurService.getAllAcheteurs(), HttpStatus.OK);
	}

	@GetMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	@PreAuthorize("hasRole('" + AuthoritiesConstants.GET_ACHETEUR_BY_ID + "')")
	public SigaiResponse getAcheteurById(@PathVariable Long id) {
		/* return Acheteur by id */
		return new SigaiResponse(AcheteurService.getAcheteurById(id), HttpStatus.OK);
	}

	@PostMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	@PreAuthorize("hasRole('" + AuthoritiesConstants.SAVE_ACHETEUR + "')")
	public SigaiResponse addAcheteur(@RequestBody AcheteurDto AcheteurDto) {
		/* add Acheteur */
		return new SigaiResponse(AcheteurService.addAcheteur(AcheteurDto), HttpStatus.OK);
	}

	@PutMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	@PreAuthorize("hasRole('" + AuthoritiesConstants.UPDATE_ACHETEUR + "')")
	public SigaiResponse updateAcheteur(@RequestBody AcheteurDto AcheteurDto) {
		/* update Acheteur */
		return new SigaiResponse(AcheteurService.updateAcheteur(AcheteurDto), HttpStatus.OK);
	}

	@DeleteMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	@PreAuthorize("hasRole('" + AuthoritiesConstants.DELETE_ACHETEUR + "')")
	public SigaiResponse deleteAcheteur(@PathVariable Long id) {
		/* delete Acheteur */
		AcheteurService.deleteAcheteur(id);
		return new SigaiResponse(HttpStatus.OK);
	}

}
