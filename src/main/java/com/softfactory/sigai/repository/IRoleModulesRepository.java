/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.softfactory.sigai.entities.RoleModulesEntity;

@Repository
public interface IRoleModulesRepository extends JpaRepository<RoleModulesEntity, Long> {
	
	/**
	 * get RoleModules by id
	 * */
	@Query("SELECT a FROM VilleEntity a WHERE a.id = :id")
	RoleModulesEntity getRoleModulesBydId(@Param("id") Long id);
}