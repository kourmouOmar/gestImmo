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
import com.softfactory.sigai.controllers.dto.GarantDto;
import com.softfactory.sigai.services.impl.GarantService;
import com.softfactory.sigai.util.Constants;

/**
 * Spring controller "Garant"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */
@RestController
@RequestMapping("/garants")
public class GarantController {

	@Autowired
	private GarantService GarantService;

	@GetMapping(value = "/v0", headers = Constants.HEADERS)
	@PreAuthorize("hasRole('" + AuthoritiesConstants.GET_ALL_GARANT + "')")
	public SigaiResponse getAllGarants() {
		/* get all Garant */
		return new SigaiResponse(GarantService.getAllGarants(), HttpStatus.OK);
	}

	@GetMapping(value ="/v0/{id}", headers = Constants.HEADERS)
	@PreAuthorize("hasRole('" + AuthoritiesConstants.GET_ETAT_BY_ID + "')")
	public SigaiResponse getGarantById(@PathVariable Long id) {
		/* return Garant by id */
		return new SigaiResponse(GarantService.getGarantById(id), HttpStatus.OK);
	}

	@PostMapping(value = "/v0", headers = Constants.HEADERS)
	@PreAuthorize("hasRole('" + AuthoritiesConstants.SAVE_GARANT + "')")
	public SigaiResponse addGarant(@RequestBody GarantDto GarantDto) {
		/* add Garant */
		return new SigaiResponse(GarantService.addGarant(GarantDto), HttpStatus.OK);
	}

	@PutMapping(value = "/v0", headers = Constants.HEADERS)
	@PreAuthorize("hasRole('" + AuthoritiesConstants.UPDATE_GARANT + "')")
	public SigaiResponse updateGarant(@RequestBody GarantDto GarantDto) {
		/* update Garant */
		return new SigaiResponse(GarantService.updateGarant(GarantDto), HttpStatus.OK);
	}

	@DeleteMapping(value = "/v0", headers = Constants.HEADERS)
	@PreAuthorize("hasRole('" + AuthoritiesConstants.DELETE_GARANT + "')")
	public SigaiResponse deleteGarant(@PathVariable Long id) {
		/* delete Garant */
		GarantService.deleteGarant(id);
		return new SigaiResponse(HttpStatus.OK);
	}

}
