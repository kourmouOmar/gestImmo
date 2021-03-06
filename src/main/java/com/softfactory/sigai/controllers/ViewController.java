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
import com.softfactory.sigai.controllers.dto.ViewDto;
import com.softfactory.sigai.services.IViewService;
import com.softfactory.sigai.util.Constants;

/**
 * Spring controller "View"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */
@RestController
@RequestMapping("/views")
public class ViewController {

	@Autowired
	private IViewService ViewService;

	@GetMapping(value = "/v0", headers = Constants.HEADERS)
	@PreAuthorize("hasRole('" + AuthoritiesConstants.ASSISTANTE + "')")
	public SigaiResponse getAllViews() {
		/* get all View */
		return new SigaiResponse(ViewService.getAllViews(), HttpStatus.OK);
	}

	@GetMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	@PreAuthorize("hasRole('" + AuthoritiesConstants.ASSISTANTE + "')")
	public SigaiResponse getViewById(@PathVariable Long id) {
		/* return View by id */
		return new SigaiResponse(ViewService.getViewById(id), HttpStatus.OK);
	}

	@PostMapping(value = "/v0", headers = Constants.HEADERS)
	public SigaiResponse addView(@RequestBody ViewDto ViewDto) {
		/* add View */
		return new SigaiResponse(ViewService.addView(ViewDto), HttpStatus.OK);
	}

	@PutMapping(value = "/v0", headers = Constants.HEADERS)
	@PreAuthorize("hasRole('" + AuthoritiesConstants.ASSISTANTE + "')")
	public SigaiResponse updateView(@RequestBody ViewDto ViewDto) {
		/* update View */
		return new SigaiResponse(ViewService.updateView(ViewDto), HttpStatus.OK);
	}

	@DeleteMapping(value = "/v0", headers = Constants.HEADERS)
	@PreAuthorize("hasRole('" + AuthoritiesConstants.ASSISTANTE + "')")
	public SigaiResponse deleteView(@PathVariable Long id) {
		/* delete View */
		ViewService.deleteView(id);
		return new SigaiResponse(HttpStatus.OK);
	}

}
