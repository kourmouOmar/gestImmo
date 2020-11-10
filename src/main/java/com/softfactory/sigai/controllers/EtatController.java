package com.softfactory.sigai.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.softfactory.sigai.config.SigaiResponse;
import com.softfactory.sigai.controllers.dto.EtatDto;
import com.softfactory.sigai.services.IEtatService;

/**
 * Spring controller "Etat"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */
@RestController
public class EtatController {

	@Autowired
	private IEtatService EtatService;

	@GetMapping("/etats")
	public SigaiResponse getAllEtats() {
		/* get all Etat */
		return new SigaiResponse(EtatService.getAllEtats(), HttpStatus.OK);
	}

	@GetMapping("/etats/{id}")
	public SigaiResponse getEtatById(@PathVariable Long id) {
		/* return Etat by id */
		return new SigaiResponse(EtatService.getEtatById(id), HttpStatus.OK);
	}

	@PostMapping("/etats/{id}")
	public SigaiResponse addEtat(@RequestBody EtatDto EtatDto) {
		/* add Etat */
		return new SigaiResponse(EtatService.addEtat(EtatDto), HttpStatus.OK);
	}

	@PutMapping("/etats/{id}")
	public SigaiResponse updateEtat(@RequestBody EtatDto EtatDto) {
		/* update Etat */
		return new SigaiResponse(EtatService.updateEtat(EtatDto), HttpStatus.OK);
	}

	@DeleteMapping("/etat/{id}")
	public SigaiResponse deleteEtat(@PathVariable Long id) {
		/* delete Etat */
		EtatService.deleteEtat(id);
		return new SigaiResponse(HttpStatus.OK);
	}

}
