/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.softfactory.sigai.entities.TypeGarantEntity;

@Repository
public interface ITypeGarantRepository extends JpaRepository<TypeGarantEntity, Long> {
	
	/**
	 * get TypeGarantEntity by id
	 * */
	@Query("SELECT a FROM TypeGarantEntity a WHERE a.id = :id")
	TypeGarantEntity getTypeGarantBydId(@Param("id") Long id);
}