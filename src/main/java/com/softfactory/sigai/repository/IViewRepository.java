package com.softfactory.sigai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.softfactory.sigai.entities.ViewEntity;

@Repository
public interface IViewRepository extends JpaRepository<ViewEntity, Long> {
	
	/**
	 * get ViewEntity by id
	 * */
	@Query("SELECT a FROM ViewEntity a WHERE a.id = :id")
	ViewEntity getViewBydId(@Param("id") Long id);
}