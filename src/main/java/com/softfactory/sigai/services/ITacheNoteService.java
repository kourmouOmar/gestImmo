/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.services;

import java.util.List;

import com.softfactory.sigai.controllers.dto.TacheNoteDto;
import com.softfactory.sigai.entities.TacheNoteEntity;

/**
 * 
 * @author omarkourmou1
 *
 */
public interface ITacheNoteService {

	/**
	 * 
	 * @param id
	 * @return
	 */
	TacheNoteEntity getTacheNoteById(Long id);

	/**
	 * 
	 * @return
	 */
	List<TacheNoteEntity> getAllTacheNotes();

	/**
	 * 
	 * @param tacheNoteDto
	 * @return
	 */
	TacheNoteEntity addTacheNote(TacheNoteDto tacheNoteDto);

	/**
	 * 
	 * @param tacheNoteDto
	 * @return
	 */
	TacheNoteEntity updateTacheNote(TacheNoteDto tacheNoteDto);

	/**
	 * 
	 * @param id
	 */
	void deleteTacheNote(Long id);

}