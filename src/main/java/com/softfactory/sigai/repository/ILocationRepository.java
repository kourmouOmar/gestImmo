package com.softfactory.sigai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.softfactory.sigai.entities.LocationEntity;

@Repository
public interface ILocationRepository extends JpaRepository<LocationEntity, Long> {
	
	/**
	 * get LocationEntity by id
	 * */
	@Query("SELECT a FROM LocationEntity a WHERE a.id = :id")
	LocationEntity getLocationBydId(@Param("id") Long id);
}