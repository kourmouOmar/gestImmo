package com.softfactory.sigai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.softfactory.sigai.entities.VenteEntity;

@Repository
public interface IVenteRepository extends JpaRepository<VenteEntity, Long> {
	
	/**
	 * get VenteEntity by id
	 * */
	@Query("SELECT a FROM VenteEntity a WHERE a.id = :id")
	VenteEntity getVenteBydId(@Param("id") Long id);
}