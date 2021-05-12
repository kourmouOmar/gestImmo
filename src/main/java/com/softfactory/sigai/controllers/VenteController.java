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
import com.softfactory.sigai.controllers.dto.VenteDto;
import com.softfactory.sigai.services.impl.VenteService;
import com.softfactory.sigai.util.Constants;

/**
 * Spring controller "Vente"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */
@RestController
@RequestMapping("/ventes")
public class VenteController {

	@Autowired
	private VenteService VenteService;

	@RequestMapping(value = "/v0", headers = Constants.HEADERS)
	@PreAuthorize("hasRole('" + AuthoritiesConstants.GET_ALL_VENTE + "')")
	public SigaiResponse getAllVentes() {
		/* get all Vente */
		return new SigaiResponse(VenteService.getAllVentes(), HttpStatus.OK);
	}

	@RequestMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	@PreAuthorize("hasRole('" + AuthoritiesConstants.GET_VENTE_BY_ID + "')")
	public SigaiResponse getVenteById(@PathVariable Long id) {
		/* return Vente by id */
		return new SigaiResponse(VenteService.getVenteById(id), HttpStatus.OK);
	}

	@PostMapping(value = "/v0", headers = Constants.HEADERS)
	@PreAuthorize("hasRole('" + AuthoritiesConstants.SAVE_VENTE + "')")
	public SigaiResponse addVente(@RequestBody VenteDto VenteDto) {
		/* add Vente */
		return new SigaiResponse(VenteService.addVente(VenteDto), HttpStatus.OK);
	}

	@PutMapping(value = "/v0", headers = Constants.HEADERS)
	@PreAuthorize("hasRole('" + AuthoritiesConstants.UPDATE_VENTE + "')")
	public SigaiResponse updateVente(@RequestBody VenteDto VenteDto) {
		/* update Vente */
		return new SigaiResponse(VenteService.updateVente(VenteDto), HttpStatus.OK);
	}

	@DeleteMapping(value = "/v0", headers = Constants.HEADERS)
	@PreAuthorize("hasRole('" + AuthoritiesConstants.DELETE_VENTE + "')")
	public SigaiResponse deleteVente(@PathVariable Long id) {
		/* delete Vente */
		VenteService.deleteVente(id);
		return new SigaiResponse(HttpStatus.OK);
	}

}
