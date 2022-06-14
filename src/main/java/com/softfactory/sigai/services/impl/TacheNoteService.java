/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softfactory.sigai.controllers.dto.TacheNoteDto;
import com.softfactory.sigai.entities.TacheNoteEntity;
import com.softfactory.sigai.repository.ITacheNotesRepository;
import com.softfactory.sigai.services.ITacheNoteService;

/**
 * 
 * @author omarkourmou1
 *
 */

@Service
public class TacheNoteService implements ITacheNoteService {

	@Autowired
	ITacheNotesRepository tacheNotoRepository;

	@Override
	public TacheNoteEntity getTacheNoteById(Long id) {
		return tacheNotoRepository.getOne(id);
	}

	@Override
	public List<TacheNoteEntity> getAllTacheNotes() {
		return tacheNotoRepository.findAll();
	}

	@Override
	public TacheNoteEntity addTacheNote(TacheNoteDto tacheNoteDto) {
		return tacheNotoRepository.save(TacheNoteDto.dtoToEntity(tacheNoteDto));
	}

	@Override
	public TacheNoteEntity updateTacheNote(TacheNoteDto tacheNoteDto) {
		return tacheNotoRepository.save(TacheNoteDto.dtoToEntity(tacheNoteDto));
	}

	@Override
	public void deleteTacheNote(Long id) {
		tacheNotoRepository.deleteById(id);
	}
}