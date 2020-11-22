package com.softfactory.sigai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.softfactory.sigai.entities.ProprietaireEntity;

@Repository
public interface IProprietaireRepository extends JpaRepository<ProprietaireEntity, Long> {
	
	/**
	 * get ProprietaireEntity by id
	 * */
	@Query("SELECT a FROM ProprietaireEntity a WHERE a.id = :id")
	ProprietaireEntity getProprietaireBydId(@Param("id") Long id);
}