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
import com.softfactory.sigai.controllers.dto.BienDto;
import com.softfactory.sigai.services.IBienService;
import com.softfactory.sigai.util.Constants;

/**
 * Spring controller "Bien"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */
@RestController
@RequestMapping("/Biens")
public class BienController {

	@Autowired
	private IBienService BienService;

	@GetMapping(value = "/v0", headers = Constants.HEADERS)
	@PreAuthorize("hasRole('" + AuthoritiesConstants.ADMIN + "')")
	public SigaiResponse getAllBiens() {
		/* get all Bien */
		return new SigaiResponse(BienDto.entitiesToDtos(BienService.getAllBiens()), HttpStatus.OK);
	}

	@GetMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	public SigaiResponse getBienById(@PathVariable Long id) {
		/* return Bien by id */
		return new SigaiResponse(BienService.getBienById(id), HttpStatus.OK);
	}

	@PostMapping(value = "/v0", headers = Constants.HEADERS)
	public SigaiResponse addBien(@RequestBody BienDto BienDto) {
		/* add Bien */
		return new SigaiResponse(BienService.addBien(BienDto), HttpStatus.OK);
	}

	@PutMapping(value = "/v0", headers = Constants.HEADERS)
	public SigaiResponse updateBien(@RequestBody BienDto BienDto) {
		/* update Bien */
		return new SigaiResponse(BienService.updateBien(BienDto), HttpStatus.OK);
	}

	@DeleteMapping(value = "/v0", headers = Constants.HEADERS)
	public SigaiResponse deleteBien(@PathVariable Long id) {
		/* delete Bien */
		BienService.deleteBien(id);
		return new SigaiResponse(HttpStatus.OK);
	}

}
