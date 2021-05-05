/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.controllers.dto;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.softfactory.sigai.entities.RolePermissionsEntity;
import com.softfactory.sigai.util.Functions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RolePermissionsDto implements Serializable {

private static final long serialVersionUID = 1L;

    private Long idRolePermissions ;
	// Relations
    private RoleDto roleDto;
    private PermissionDto permissionDto;
    private List<RoleMenusPermissionsDto> listOfRoleMenusPermissionsDto;  

	// Relation Enum
	public enum RolePermissionsRelationsEnum {
		role,
		permission,
    	listOfRoleMenusPermissions; 
	}
   
	/**
     * Convert RolePermissionsEntity -> RolePermissionsDto
     * @return RolePermissionsDto
     */
    public static RolePermissionsDto entityToDto(RolePermissionsEntity entity){
		RolePermissionsDto dto = null;
		if(entity != null){
			dto = new RolePermissionsDto();
        	dto.setIdRolePermissions(entity.getIdRolePermissions());
		}
		return  dto;
    }
	/**
     * Convert RolePermissionsDto -> RolePermissionsEntity
     * @param RolePermissionsDto
     */
    public static RolePermissionsEntity dtoToEntity(RolePermissionsDto dto){
		RolePermissionsEntity entity = null;
		if(dto != null){
			entity = new RolePermissionsEntity();
        	entity.setIdRolePermissions(dto.getIdRolePermissions()) ;
		}
		
		return  entity;
    }
    /**
     * Convert list RolePermissionsDto -> list RolePermissionsEntity
     * @param List<RolePermissionsDto>
     */
    public static List<RolePermissionsEntity> dtosToEntities(List<RolePermissionsDto> listDto){
		List<RolePermissionsEntity> list = new ArrayList<>();
 		if(Functions.isNotEmpty(listDto)){
        	for(RolePermissionsDto dto:listDto){
    			list.add(dtoToEntity(dto));
    		}
		}
        return list;
    }
    /**
     * Convert list RolePermissionsEntity -> list RolePermissionsDto
     * @param List<RolePermissionsEntity>
     */
    public static List<RolePermissionsDto> entitiesToDtos(List<RolePermissionsEntity> listEntity){
		List<RolePermissionsDto> list = new ArrayList<>();
		if(Functions.isNotEmpty(listEntity)){
        	for(RolePermissionsEntity entity:listEntity){
    			list.add(entityToDto(entity));
    		}
		}
        return list;
    }
}