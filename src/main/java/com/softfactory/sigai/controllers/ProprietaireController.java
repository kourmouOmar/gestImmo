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
import com.softfactory.sigai.controllers.dto.ProprietaireDto;
import com.softfactory.sigai.services.impl.ProprietaireService;

/**
 * Spring controller "Proprietaire"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */
@RestController
public class ProprietaireController {

	@Autowired
	private ProprietaireService proprietaireService;

	@RequestMapping("/proprietaires")
	@PreAuthorize("hasRole('"+AuthoritiesConstants.ADMIN+"')")
	public SigaiResponse getAllProprietaires() {
		/* get all Proprietaire */
		return new SigaiResponse(ProprietaireDto.entitiesToDtos(proprietaireService.getAllProprietaires()), HttpStatus.OK);
	}

	@RequestMapping("/proprietaires/{id}")
	@PreAuthorize("hasRole('"+AuthoritiesConstants.ADMIN+"')")
	public SigaiResponse getProprietaireById(@PathVariable Long id) {
		/* return Proprietaire by id */
		return new SigaiResponse(proprietaireService.getProprietaireById(id), HttpStatus.OK);
	}

	@PostMapping("/proprietaires")
	@PreAuthorize("hasRole('"+AuthoritiesConstants.ADMIN+"')")
	public SigaiResponse addProprietaire(@RequestBody ProprietaireDto proprietaireDto) {
		/* add Proprietaire */
		return new SigaiResponse(proprietaireService.addProprietaire(proprietaireDto), HttpStatus.OK);
	}

	@PutMapping("/proprietaire")
	@PreAuthorize("hasRole('"+AuthoritiesConstants.ADMIN+"')")
	public SigaiResponse updateProprietaire(@RequestBody ProprietaireDto proprietaireDto) {
		/* update Proprietaire */
		return new SigaiResponse(proprietaireService.updateProprietaire(proprietaireDto), HttpStatus.OK);
	}

	@DeleteMapping("/proprietaire/{id}")
	@PreAuthorize("hasRole('"+AuthoritiesConstants.ADMIN+"')")
	public SigaiResponse deleteProprietaire(@PathVariable Long id) {
		/* delete Proprietaire */
		proprietaireService.deleteProprietaire(id);
		return new SigaiResponse(HttpStatus.OK);
	}

}
