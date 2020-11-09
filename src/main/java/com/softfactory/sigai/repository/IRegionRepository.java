package com.softfactory.sigai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.softfactory.sigai.entities.RegionEntity;

@Repository
public interface IRegionRepository extends JpaRepository<RegionEntity, Long> {
	

	/**
	 * get RegionEntity by id
	 * */
	@Query("SELECT a FROM RegionEntity a WHERE a.id = :id")
	RegionEntity getRegionBydId(@Param("id") Long id);
}