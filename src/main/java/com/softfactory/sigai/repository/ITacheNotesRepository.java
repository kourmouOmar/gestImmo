/*
@Column(name = "description", length = 255)
	private String description; * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.softfactory.sigai.entities.TacheNoteEntity;

@Repository
public interface ITacheNotesRepository extends JpaRepository<TacheNoteEntity, Long> {

	/**
	 * get TacheNoteEntity by id
	 */
	@Query("SELECT a FROM TacheNoteEntity a WHERE a.id = :id")
	TacheNoteEntity getTacheNoteBydId(@Param("id") Long id);
}