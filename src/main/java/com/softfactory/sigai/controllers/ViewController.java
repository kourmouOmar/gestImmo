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
import com.softfactory.sigai.controllers.dto.VueDto;
import com.softfactory.sigai.services.IVueService;
import com.softfactory.sigai.util.Constants;

/**
 * Spring controller "Ville"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */
@RestController
@RequestMapping("/view")
public class ViewController {

	@Autowired
	private IVueService vueService;

	@GetMapping(value = "/v0", headers = Constants.HEADERS)
	// @PreAuthorize("hasRole('" + AuthoritiesConstants.GET_ALL_VILLE + "')")
	public SigaiResponse getAllView() {
		/* get all Ville */
		return new SigaiResponse(VueDto.entitiesToDtos(vueService.getAllVues()), HttpStatus.OK);
	}

	@GetMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	//@PreAuthorize("hasRole('" + AuthoritiesConstants.ADMIN + "')")
	public SigaiResponse getViewById(@PathVariable Long id) {
		/* return Ville by id */
		return new SigaiResponse(vueService.getVueById(id), HttpStatus.OK);
	}

	@PostMapping(value = "/v0", headers = Constants.HEADERS)
	//@PreAuthorize("hasRole('" + AuthoritiesConstants.ADMIN + "')")
	public SigaiResponse addView(@RequestBody VueDto vueDto) {

		/* add Ville */
		return new SigaiResponse(vueService.addVue(vueDto), HttpStatus.OK);
	}

	@PutMapping(value = "/v0", headers = Constants.HEADERS)
	//@PreAuthorize("hasRole('" + AuthoritiesConstants.ADMIN + "')")
	public SigaiResponse updateView(@RequestBody VueDto vueDto) {
		/* update Ville */
		return new SigaiResponse(vueService.updateVue(vueDto), HttpStatus.OK);
	}

	@DeleteMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	//@PreAuthorize("hasRole('" + AuthoritiesConstants.ADMIN + "')")
	public SigaiResponse deleteView(@PathVariable Long id) {
		/* delete Ville */
		vueService.deleteVue(id);
		return new SigaiResponse(HttpStatus.OK);
	}

}
