package com.softfactory.sigai.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	private ProprietaireService ProprietaireService;

	@RequestMapping("/proprietaires")
	public SigaiResponse getAllProprietaires() {
		/* get all Proprietaire */
		return new SigaiResponse(ProprietaireService.getAllProprietaires(), HttpStatus.OK);
	}

	@RequestMapping("/proprietaires/{id}")
	public SigaiResponse getProprietaireById(@PathVariable Long id) {
		/* return Proprietaire by id */
		return new SigaiResponse(ProprietaireService.getProprietaireById(id), HttpStatus.OK);
	}

	@PostMapping("/proprietaires/{id}")
	public SigaiResponse addProprietaire(@RequestBody ProprietaireDto ProprietaireDto) {
		/* add Proprietaire */
		return new SigaiResponse(ProprietaireService.addProprietaire(ProprietaireDto), HttpStatus.OK);
	}

	@PutMapping("/proprietaires/{id}")
	public SigaiResponse updateProprietaire(@RequestBody ProprietaireDto ProprietaireDto) {
		/* update Proprietaire */
		return new SigaiResponse(ProprietaireService.updateProprietaire(ProprietaireDto), HttpStatus.OK);
	}

	@DeleteMapping("/proprietaire/{id}")
	public SigaiResponse deleteProprietaire(@PathVariable Long id) {
		/* delete Proprietaire */
		ProprietaireService.deleteProprietaire(id);
		return new SigaiResponse(HttpStatus.OK);
	}

}
