package com.softfactory.sigai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.softfactory.sigai.entities.StyleEntity;

@Repository
public interface IStyleRepository extends JpaRepository<StyleEntity, Long> {
	
	/**
	 * get StyleEntity by id
	 * */
	@Query("SELECT a FROM StyleEntity a WHERE a.id = :id")
	StyleEntity getStyleBydId(@Param("id") Long id);
}