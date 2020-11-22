package com.softfactory.sigai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.softfactory.sigai.entities.GarantEntity;

@Repository
public interface IGarantRepository extends JpaRepository<GarantEntity, Long> {

	/**
	 * get GarantEntity by id
	 * */
	@Query("SELECT a FROM GarantEntity a WHERE a.id = :id")
	GarantEntity getGarantBydId(@Param("id") Long id);

}