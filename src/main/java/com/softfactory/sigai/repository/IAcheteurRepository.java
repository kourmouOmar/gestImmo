package com.softfactory.sigai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.softfactory.sigai.entities.AcheteurEntity;

@Repository
public interface IAcheteurRepository extends JpaRepository<AcheteurEntity, Long> {
	
	/**
	 * get acheteur by id
	 * */
	@Query("SELECT a FROM AcheteurEntity a WHERE a.id = :id")
	AcheteurEntity getAcheteurBydId(@Param("id") Long id);
}