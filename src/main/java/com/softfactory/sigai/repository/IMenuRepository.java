/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.softfactory.sigai.entities.MenuEntity;

@Repository
public interface IMenuRepository extends JpaRepository<MenuEntity, Long> {
	
	/**
	 * get Menu by id
	 * */
	@Query("SELECT a FROM VilleEntity a WHERE a.id = :id")
	MenuEntity getMenuBydId(@Param("id") Long id);
	
	
} 