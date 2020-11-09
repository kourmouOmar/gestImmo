package com.softfactory.sigai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.softfactory.sigai.entities.EtatEntity;

@Repository
public interface IEtatRepository extends JpaRepository<EtatEntity, Long> {
	
	/**
	 * get EtatEntity by id
	 * */
	@Query("SELECT e FROM EtatEntity e WHERE e.id = :id")
	EtatEntity getEtatBydId(@Param("id") Long id);

}