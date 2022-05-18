package com.softfactory.sigai.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softfactory.sigai.config.SigaiResponse;
import com.softfactory.sigai.controllers.dto.LocataireDto;
import com.softfactory.sigai.services.ILocataireService;
import com.softfactory.sigai.util.Constants;

/**
 * Spring controller "locataire"
 * 
 * @author omarkourmou1
 *
 */
@RestController
@RequestMapping("/locataire")
public class LocataireController {

	@Autowired
	private ILocataireService locataireService;

	@GetMapping(value = "/v0", headers = Constants.HEADERS)
	//@PreAuthorize("hasRole('" + AuthoritiesConstants.GET_ALL_LOCATION + "')")
	public SigaiResponse getAllLocataires() {
		/* get all locataire */
		return new SigaiResponse(LocataireDto.entitiesToDtos(locataireService.getAllLocataires()), HttpStatus.OK);
	}

	@RequestMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	//@PreAuthorize("hasRole('" + AuthoritiesConstants.GET_LOCATION_BY_ID + "')")
	public SigaiResponse getLocataireById(@PathVariable Long id) {
		/* return locataire by id */
		return new SigaiResponse(LocataireDto.entityToDto(locataireService.getLocataireById(id)), HttpStatus.OK);
	}

	@PostMapping(value = "/v0", headers = Constants.HEADERS)
	//@PreAuthorize("hasRole('" + AuthoritiesConstants.SAVE_LOCATION + "')")
	public SigaiResponse addLocataire(@RequestBody LocataireDto locataireDto) {
		/* add locataire */
		return new SigaiResponse(LocataireDto.entityToDto(locataireService.addLocataire(locataireDto)), HttpStatus.OK);
	}

	@PutMapping(value = "/v0", headers = Constants.HEADERS)
	//@PreAuthorize("hasRole('" + AuthoritiesConstants.UPDATE_LOCATION + "')")
	public SigaiResponse updateLocataire(@RequestBody LocataireDto locataireDto) {
		/* update locataire */
		return new SigaiResponse(LocataireDto.entityToDto(locataireService.updateLocataire(locataireDto)),
				HttpStatus.OK);
	}

	@DeleteMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	//@PreAuthorize("hasRole('" + AuthoritiesConstants.DELETE_LOCATION + "')")
	public SigaiResponse deleteLocataire(@PathVariable Long id) {
		/* delete locataire */
		locataireService.deleteLocataire(id);
		return new SigaiResponse(HttpStatus.OK);
	}

}
