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
import com.softfactory.sigai.controllers.dto.TypeBienDto;
import com.softfactory.sigai.services.ITypeBienService;

/**
 * Spring controller "TypeBien"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */
@RestController
public class TypeBienController {

	@Autowired
	private ITypeBienService TypeBienService;

	@RequestMapping("/typebiens")
	public SigaiResponse getAllTypeBiens() {
		/* get all TypeBien */
		return new SigaiResponse(TypeBienService.getAllTypeBiens(), HttpStatus.OK);
	}

	@RequestMapping("/typebiens/{id}")
	public SigaiResponse getTypeBienById(@PathVariable Long id) {
		/* return TypeBien by id */
		return new SigaiResponse(TypeBienService.getTypeBienById(id), HttpStatus.OK);
	}

	@PostMapping("/typebiens/{id}")
	public SigaiResponse addTypeBien(@RequestBody TypeBienDto TypeBienDto) {
		/* add TypeBien */
		return new SigaiResponse(TypeBienService.addTypeBien(TypeBienDto), HttpStatus.OK);
	}

	@PutMapping("/typebiens/{id}")
	public SigaiResponse updateTypeBien(@RequestBody TypeBienDto TypeBienDto) {
		/* update TypeBien */
		return new SigaiResponse(TypeBienService.updateTypeBien(TypeBienDto), HttpStatus.OK);
	}

	@DeleteMapping("/typebien/{id}")
	public SigaiResponse deleteTypeBien(@PathVariable Long id) {
		/* delete TypeBien */
		TypeBienService.deleteTypeBien(id);
		return new SigaiResponse(HttpStatus.OK);
	}

}
