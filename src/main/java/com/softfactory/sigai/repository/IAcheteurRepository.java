/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.softfactory.sigai.entities.AcheteurEntity;

@Repository
public interface IAcheteurRepository extends JpaRepository<AcheteurEntity, Long> {
	
	/**
	 * get Acheteur by id
	 * */
	@Query("SELECT a FROM VilleEntity a WHERE a.id = :id")
	AcheteurEntity getAcheteurBydId(@Param("id") Long id);
}