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
import com.softfactory.sigai.controllers.dto.StyleDto;
import com.softfactory.sigai.services.IStyleService;

/**
 * Spring controller "Style"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */
@RestController
public class StyleController {

	@Autowired
	private IStyleService StyleService;

	@RequestMapping("/styles")
	public SigaiResponse getAllStyles() {
		/* get all Style */
		return new SigaiResponse(StyleService.getAllStyles(), HttpStatus.OK);
	}

	@RequestMapping("/styles/{id}")
	public SigaiResponse getStyleById(@PathVariable Long id) {
		/* return Style by id */
		return new SigaiResponse(StyleService.getStyleById(id), HttpStatus.OK);
	}

	@PostMapping("/styles/{id}")
	public SigaiResponse addStyle(@RequestBody StyleDto StyleDto) {
		/* add Style */
		return new SigaiResponse(StyleService.addStyle(StyleDto), HttpStatus.OK);
	}

	@PutMapping("/styles/{id}")
	public SigaiResponse updateStyle(@RequestBody StyleDto StyleDto) {
		/* update Style */
		return new SigaiResponse(StyleService.updateStyle(StyleDto), HttpStatus.OK);
	}

	@DeleteMapping("/style/{id}")
	public SigaiResponse deleteStyle(@PathVariable Long id) {
		/* delete Style */
		StyleService.deleteStyle(id);
		return new SigaiResponse(HttpStatus.OK);
	}

}
