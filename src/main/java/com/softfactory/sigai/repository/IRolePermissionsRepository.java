/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.softfactory.sigai.entities.RolePermissionsEntity;

@Repository
public interface IRolePermissionsRepository extends JpaRepository<RolePermissionsEntity, Long> {
	
	/**
	 * get RolePermissions by id
	 * */
	@Query("SELECT a FROM RolePermissionsEntity a WHERE a.id = :id")
	RolePermissionsEntity getRolePermissionsBydId(@Param("id") Long id);
	
	/**
	 * Role Permissions Entity
	 * 
	 * @param idRole
	 * @return
	 */
	@Query("SELECT rp FROM RolePermissionsEntity rp WHERE rp.role.id = :idRole")
	List<RolePermissionsEntity> getRolePermissionByRole(@Param("idRole") Long idRole);
}