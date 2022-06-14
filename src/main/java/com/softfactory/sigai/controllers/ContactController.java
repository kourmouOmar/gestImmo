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
import com.softfactory.sigai.controllers.dto.ContactDto;
import com.softfactory.sigai.services.IContactService;
import com.softfactory.sigai.util.Constants;

/**
 * 
 * @author omarkourmou1
 *
 */
@RestController
@RequestMapping("/contacts")
public class ContactController {

	@Autowired
	private IContactService contactService;

	@GetMapping(value = "/v0", headers = Constants.HEADERS)
	public SigaiResponse getAllContacts() {
		return new SigaiResponse(ContactDto.entitiesToDtos(contactService.getAllContacts()), HttpStatus.OK);
	}

	@GetMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	public SigaiResponse getContactById(@PathVariable Long id) {
		return new SigaiResponse(contactService.getContactById(id), HttpStatus.OK);
	}

	@PostMapping(value = "/v0", headers = Constants.HEADERS)
	public SigaiResponse addContact(@RequestBody ContactDto contactDto) {
		return new SigaiResponse(ContactDto.entityToDto(contactService.addContact(contactDto)), HttpStatus.OK);
	}

	@PutMapping(value = "/v0", headers = Constants.HEADERS)
	public SigaiResponse updateContact(@RequestBody ContactDto contactDto) {
		return new SigaiResponse(ContactDto.entityToDto(contactService.updateContact(contactDto)), HttpStatus.OK);
	}

	@DeleteMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	public SigaiResponse deleteContact(@PathVariable Long id) {
		contactService.deleteContact(id);
		return new SigaiResponse(HttpStatus.OK);
	}

}
