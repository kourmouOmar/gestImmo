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
import com.softfactory.sigai.controllers.dto.EtatDto;
import com.softfactory.sigai.services.IEtatService;
import com.softfactory.sigai.util.Constants;

/**
 * Spring controller "Etat"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */
@RestController
@RequestMapping("/etats")
public class EtatController {

	@Autowired
	private IEtatService etatService;

	@GetMapping(value = "/v0", headers = Constants.HEADERS)
	@PreAuthorize("hasRole('" + AuthoritiesConstants.GET_ALL_ETAT + "')")
	public SigaiResponse getAllEtats() {
		/* get all Etat */
		return new SigaiResponse(EtatDto.entitiesToDtos(etatService.getAllEtats()), HttpStatus.OK);
	}

	@GetMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	@PreAuthorize("hasRole('" + AuthoritiesConstants.GET_ETAT_BY_ID + "')")
	public SigaiResponse getEtatById(@PathVariable Long id) {
		/* return Etat by id */
		return new SigaiResponse(etatService.getEtatById(id), HttpStatus.OK);
	}

	@PostMapping(value = "/v0", headers = Constants.HEADERS)
	@PreAuthorize("hasRole('" + AuthoritiesConstants.SAVE_ETAT+ "')")
	public SigaiResponse addEtat(@RequestBody EtatDto EtatDto) {
		/* add Etat */
		return new SigaiResponse(etatService.addEtat(EtatDto), HttpStatus.OK);
	}

	@PutMapping(value = "/v0", headers = Constants.HEADERS)
	@PreAuthorize("hasRole('" + AuthoritiesConstants.UPDATE_ETAT + "')")
	public SigaiResponse updateEtat(@RequestBody EtatDto EtatDto) {
		/* update Etat */
		return new SigaiResponse(etatService.updateEtat(EtatDto), HttpStatus.OK);
	}

	@DeleteMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	@PreAuthorize("hasRole('" + AuthoritiesConstants.DELETE_ETAT + "')")
	public SigaiResponse deleteEtat(@PathVariable Long id) {
		/* delete Etat */
		etatService.deleteEtat(id);
		return new SigaiResponse(HttpStatus.OK);
	}

}
