package com.softfactory.sigai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.softfactory.sigai.entities.ModuleEntity;

@Repository
public interface IModuleRepository extends JpaRepository<ModuleEntity, Long> {
	
	/**
	 * get ModuleEntity by id
	 * */
	@Query("SELECT a FROM ModuleEntity a WHERE a.id = :id")
	ModuleEntity getModuleBydId(@Param("id") Long id);
}