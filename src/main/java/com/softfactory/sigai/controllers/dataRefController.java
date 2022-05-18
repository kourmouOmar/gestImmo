package com.softfactory.sigai.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softfactory.sigai.config.SigaiResponse;
import com.softfactory.sigai.services.IDataRefService;
import com.softfactory.sigai.util.Constants;

/**
 * Spring controller "data Ref"
 * 
 * @author omarkourmou1
 *
 */
@RestController
@RequestMapping("/data-ref")
public class dataRefController {

	@Autowired
	private IDataRefService  dataRefService;

	@GetMapping(value = "/v0", headers = Constants.HEADERS)
	public SigaiResponse getDataRef() {
		/* get all dataRefs */
		return new SigaiResponse(dataRefService.getALlDataRef(), HttpStatus.OK);
	}

}
