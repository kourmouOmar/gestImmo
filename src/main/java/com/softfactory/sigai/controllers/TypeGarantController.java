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
import com.softfactory.sigai.controllers.dto.TypeGarantDto;
import com.softfactory.sigai.services.impl.TypeGarantService;

/**
 * Spring controller "TypeGarant"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */
@RestController
public class TypeGarantController {

	@Autowired
	private TypeGarantService TypeGarantService;

	@RequestMapping("/typegarants")
	public SigaiResponse getAllTypeGarants() {
		/* get all TypeGarant */
		return new SigaiResponse(TypeGarantService.getAllTypeGarants(), HttpStatus.OK);
	}

	@RequestMapping("/typegarants/{id}")
	public SigaiResponse getTypeGarantById(@PathVariable Long id) {
		/* return TypeGarant by id */
		return new SigaiResponse(TypeGarantService.getTypeGarantById(id), HttpStatus.OK);
	}

	@PostMapping("/typegarants/{id}")
	public SigaiResponse addTypeGarant(@RequestBody TypeGarantDto TypeGarantDto) {
		/* add TypeGarant */
		return new SigaiResponse(TypeGarantService.addTypeGarant(TypeGarantDto), HttpStatus.OK);
	}

	@PutMapping("/typegarants/{id}")
	public SigaiResponse updateTypeGarant(@RequestBody TypeGarantDto TypeGarantDto) {
		/* update TypeGarant */
		return new SigaiResponse(TypeGarantService.updateTypeGarant(TypeGarantDto), HttpStatus.OK);
	}

	@DeleteMapping("/typegarant/{id}")
	public SigaiResponse deleteTypeGarant(@PathVariable Long id) {
		/* delete TypeGarant */
		TypeGarantService.deleteTypeGarant(id);
		return new SigaiResponse(HttpStatus.OK);
	}

}
