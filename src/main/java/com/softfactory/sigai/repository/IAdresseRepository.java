package com.softfactory.sigai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.softfactory.sigai.entities.AdresseEntity;

@Repository
public interface IAdresseRepository extends JpaRepository<AdresseEntity, Long> {
	
	/**
	 * get adreesse by id
	 * */
	@Query("SELECT a FROM AdresseEntity a WHERE a.id = :id")
	AdresseEntity getAdresseBydId(@Param("id") Long id);
}