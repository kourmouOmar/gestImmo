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
import com.softfactory.sigai.controllers.dto.TypeBienDto;
import com.softfactory.sigai.services.ITypeBienService;
import com.softfactory.sigai.util.Constants;

/**
 * Spring controller "TypeBien"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */
@RestController
@RequestMapping("/type-biens")
public class TypeBienController {

	@Autowired
	private ITypeBienService TypeBienService;

	@GetMapping(value = "/v0", headers = Constants.HEADERS)
	@PreAuthorize("hasRole('" + AuthoritiesConstants.GET_ALL_TYPE_BIEN + "')")
	public SigaiResponse getAllTypeBiens() {
		/* get all TypeBien */
		return new SigaiResponse(TypeBienService.getAllTypeBiens(), HttpStatus.OK);
	}

	@GetMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	@PreAuthorize("hasRole('" + AuthoritiesConstants.GET_TYPE_BIEN_BY_ID + "')")
	public SigaiResponse getTypeBienById(@PathVariable Long id) {
		/* return TypeBien by id */
		return new SigaiResponse(TypeBienService.getTypeBienById(id), HttpStatus.OK);
	}

	@PostMapping(value = "/v0", headers = Constants.HEADERS)
	@PreAuthorize("hasRole('" + AuthoritiesConstants.SAVE_TYPE_BIEN + "')")
	public SigaiResponse addTypeBien(@RequestBody TypeBienDto TypeBienDto) {
		/* add TypeBien */
		return new SigaiResponse(TypeBienService.addTypeBien(TypeBienDto), HttpStatus.OK);
	}

	@PutMapping(value = "/v0", headers = Constants.HEADERS)
	@PreAuthorize("hasRole('" + AuthoritiesConstants.UPDATE_TYPE_BIEN + "')")
	public SigaiResponse updateTypeBien(@RequestBody TypeBienDto TypeBienDto) {
		/* update TypeBien */
		return new SigaiResponse(TypeBienService.updateTypeBien(TypeBienDto), HttpStatus.OK);
	}

	@DeleteMapping(value = "/v0", headers = Constants.HEADERS)
	@PreAuthorize("hasRole('" + AuthoritiesConstants.DELETE_TYPE_BIEN + "')")
	public SigaiResponse deleteTypeBien(@PathVariable Long id) {
		/* delete TypeBien */
		TypeBienService.deleteTypeBien(id);
		return new SigaiResponse(HttpStatus.OK);
	}

}
