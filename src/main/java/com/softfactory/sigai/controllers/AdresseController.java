
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
import com.softfactory.sigai.controllers.dto.AdresseDto;
import com.softfactory.sigai.services.IAdresseService;
import com.softfactory.sigai.util.Constants;

/**
 * Spring controller "Adresse"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */
@RestController
@RequestMapping("/adresses")
public class AdresseController {

	@Autowired
	private IAdresseService adresseService;

	@GetMapping(value = "/v0", headers = Constants.HEADERS)
	@PreAuthorize("hasRole('"+AuthoritiesConstants.GET_ALL_ADRESSE+"')")
	public SigaiResponse getAllAdresses() {
		/* get all Adresse */
		return new SigaiResponse(adresseService.getAllAdresses(), HttpStatus.OK);
	}

	@GetMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	@PreAuthorize("hasRole('"+AuthoritiesConstants.GET_ADRESSE_BY_ID+"')")
	public SigaiResponse getAdresseById(@PathVariable Long id) {
		/* return Adresse by id */
		return new SigaiResponse(adresseService.getAdresseById(id), HttpStatus.OK);
	}

	@PostMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	@PreAuthorize("hasRole('"+AuthoritiesConstants.SAVE_ADRESSE+"')")
	public SigaiResponse addAdresse(@RequestBody AdresseDto AdresseDto) {
		/* add Adresse */
		return new SigaiResponse(adresseService.addAdresse(AdresseDto), HttpStatus.OK);
	}

	@PutMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	@PreAuthorize("hasRole('"+AuthoritiesConstants.UPDATE_ADRESSE+"')")
	public SigaiResponse updateAdresse(@RequestBody AdresseDto AdresseDto) {
		/* update Adresse */
		return new SigaiResponse(adresseService.updateAdresse(AdresseDto), HttpStatus.OK);
	}

	@DeleteMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	@PreAuthorize("hasRole('"+AuthoritiesConstants.DELETE_ADRESSE+"')")
	public SigaiResponse deleteAdresse(@PathVariable Long id) {
		/* delete Adresse */
		adresseService.deleteAdresse(id);
		return new SigaiResponse(HttpStatus.OK);
	}

}
