/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.softfactory.sigai.entities.VilleEntity;

@Repository
public interface IVilleRepository extends JpaRepository<VilleEntity, Long> {
	
	/**
	 * get Ville by id
	 * */
	@Query("SELECT a FROM VilleEntity a WHERE a.id = :id")
	VilleEntity getVilleBydId(@Param("id") Long id);
}