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
import com.softfactory.sigai.controllers.dto.PaysDto;
import com.softfactory.sigai.services.IPaysService;

/**
 * Spring controller "Pays"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */
@RestController
public class PaysController {

	@Autowired
	private IPaysService PaysService;

	@GetMapping("/payss")
	public SigaiResponse getAllPayss() {
		/* get all Pays */
		return new SigaiResponse(PaysService.getAllPayss(), HttpStatus.OK);
	}

	@GetMapping("/payss/{id}")
	public SigaiResponse getPaysById(@PathVariable Long id) {
		/* return Pays by id */
		return new SigaiResponse(PaysService.getPaysById(id), HttpStatus.OK);
	}

	@PostMapping("/payss/{id}")
	public SigaiResponse addPays(@RequestBody PaysDto PaysDto) {
		/* add Pays */
		return new SigaiResponse(PaysService.addPays(PaysDto), HttpStatus.OK);
	}

	@PutMapping("/payss/{id}")
	public SigaiResponse updatePays(@RequestBody PaysDto PaysDto) {
		/* update Pays */
		return new SigaiResponse(PaysService.updatePays(PaysDto), HttpStatus.OK);
	}

	@DeleteMapping("/pays/{id}")
	public SigaiResponse deletePays(@PathVariable Long id) {
		/* delete Pays */
		PaysService.deletePays(id);
		return new SigaiResponse(HttpStatus.OK);
	}

}
