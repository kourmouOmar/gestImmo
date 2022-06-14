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
import com.softfactory.sigai.controllers.dto.TacheNoteDto;
import com.softfactory.sigai.services.ITacheNoteService;
import com.softfactory.sigai.util.Constants;

/**
 * 
 * @author omarkourmou1
 *
 */
@RestController
@RequestMapping("/tache-note")
public class TacheNoteController {

	@Autowired
	private ITacheNoteService tacheNoteService;

	@GetMapping(value = "/v0", headers = Constants.HEADERS)
	public SigaiResponse getAllContacts() {
		return new SigaiResponse(TacheNoteDto.entitiesToDtos(tacheNoteService.getAllTacheNotes()), HttpStatus.OK);
	}

	@GetMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	public SigaiResponse getContactById(@PathVariable Long id) {
		return new SigaiResponse(tacheNoteService.getTacheNoteById(id), HttpStatus.OK);
	}

	@PostMapping(value = "/v0", headers = Constants.HEADERS)
	public SigaiResponse addTacheNote(@RequestBody TacheNoteDto tacheNoteDto) {
		return new SigaiResponse(TacheNoteDto.entityToDto(tacheNoteService.addTacheNote(tacheNoteDto)), HttpStatus.OK);
	}

	@PutMapping(value = "/v0", headers = Constants.HEADERS)
	public SigaiResponse updateTacheNote(@RequestBody TacheNoteDto tacheNoteDto) {
		return new SigaiResponse(TacheNoteDto.entityToDto(tacheNoteService.updateTacheNote(tacheNoteDto)),
				HttpStatus.OK);
	}

	@DeleteMapping(value = "/v0/{id}", headers = Constants.HEADERS)
	public SigaiResponse deleteTacheNote(@PathVariable Long id) {
		tacheNoteService.deleteTacheNote(id);
		return new SigaiResponse(HttpStatus.OK);
	}

}
