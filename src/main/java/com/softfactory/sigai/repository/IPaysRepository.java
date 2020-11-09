
package com.softfactory.sigai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.softfactory.sigai.entities.PaysEntity;

@Repository
public interface IPaysRepository extends JpaRepository<PaysEntity, Long> {
	
	/**
	 * get PaysEntity by id
	 * */
	@Query("SELECT a FROM PaysEntity a WHERE a.id = :id")
	PaysEntity getPaysBydId(@Param("id") Long id);
	
}