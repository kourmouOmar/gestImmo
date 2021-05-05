/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.softfactory.sigai.entities.MenuPermissionsEntity;

@Repository
public interface IMenuPermissionsRepository extends JpaRepository<MenuPermissionsEntity, Long> {
	
	/**
	 * get MenuPermissions by id
	 * */
	@Query("SELECT a FROM VilleEntity a WHERE a.id = :id")
	MenuPermissionsEntity getMenuPermissionsBydId(@Param("id") Long id);
}