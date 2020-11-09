package com.softfactory.sigai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.softfactory.sigai.entities.BienEntity;

@Repository
public interface IBienRepository extends JpaRepository<BienEntity, Long> {
	
	/**
	 * get BienEntity by id
	 * */
	@Query("SELECT b FROM BienEntity b WHERE b.id = :id")
	BienEntity getBienBydId(@Param("id") Long id);
}